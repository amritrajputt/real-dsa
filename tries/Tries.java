package tries;

public class Tries {
    static class Node {
        Node[] children;
        boolean endOfRow;

        public Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            endOfRow = false;
        }
    }

    static Node root = new Node();

    public static void main(String[] args) {

    }
}