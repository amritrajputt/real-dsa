package project;

import java.util.*;

import project.Trie.Node;

public class SearchString {
    public static List<String> searchInTrie(Trie trie, String word) {
        Node curr = trie.root;
        SearchString suggestion  = new SearchString();
        ArrayList<String> result = new ArrayList<>();
        StringBuilder suggestedWord = new StringBuilder();
        int len = word.length();
        for (int i = 0; i < len; i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (curr.children[index] == null) {
                System.out.println("No words Matched");
                return result;
            }
            curr = curr.children[index];
        }
        suggestion.dfs(curr, word, result);
        return result;
    }

    private void dfs(Node node, String currentWord, List<String> result) {
        if (node == null) {
            return;
        }
        if (node.endOfWord) {
            result.add(currentWord);
        }
        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null) {
                char nextChar = (char) (i + 'a');
                dfs(node.children[i], currentWord + nextChar, result);
            }
        }
    }
}
