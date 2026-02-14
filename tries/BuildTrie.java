package tries;

public class BuildTrie {

    
    static class Node {
        Node[] children;
        boolean endOfWord;

        Node() {
            children = new Node[26];
            endOfWord = false;
        }
    }

    public void preProcess(String paragraph) {
        paragraph = paragraph.toLowerCase();
        StringBuilder cleaned = new StringBuilder();
        for (int i = 0; i < paragraph.length(); i++) {
            char ch = paragraph.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || ch == ' ') {
                cleaned.append(ch);
            }
        }
        String cleanedParagraph = cleaned.toString();
        String[] words = cleanedParagraph.split(" ");
        for (int i = 0; i < words.length; i++) {
            String currentString = words[i];
            insertionInTrie(currentString);
        }
    }

    Node root = new Node();

    public void insertionInTrie(String word) {
        Node curr = root;
        int len = word.length();
        for (int i = 0; i < len; i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        curr.endOfWord = true;
    }
}
