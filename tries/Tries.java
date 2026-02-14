package tries;

public class Tries {
    static class Node {
        Node[] children;
        boolean endOfWord;

        public Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            endOfWord = false;
        }
    }

    static Node root = new Node();

    public void insertion(String word) {
        Node curr = root;
        int n = word.length();
        for (int i = 0; i < n; i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        curr.endOfWord = true;
    }

    public static boolean search(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (curr.children[index] == null) {
                return false;
            }
            if (i == word.length() - 1 && curr.children[index].endOfWord == false){
                return false;
            }
            curr = curr.children[index];
        }
        return true;
    }
    public static void preProcess(String paragraph){
        // open text file filter out words call insert function for each word
    }
}

