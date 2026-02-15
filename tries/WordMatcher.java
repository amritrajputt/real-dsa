package tries;

import tries.BuildTrie.Node;

public class WordMatcher {
    
   public static boolean isWordMatched(BuildTrie trie, String word) {
    Node curr = trie.root;
    word = word.toLowerCase();
    
    for (char c : word.toCharArray()) {
        int index = (int) c ;
        if (curr.children[index] == null) {
            return false;
        }
        curr = curr.children[index];
    }
    return curr.endOfWord;
}

}
