package project;

public class Trie {
    static class Node{
        Node[] children;
        boolean endOfWord;
        Node(){
            children = new Node[26];
            endOfWord = false;
        }
    }
    
    Node root = new Node();

    public void preProcess(String paragraph){
        paragraph = paragraph.trim().toLowerCase();
        StringBuilder cleaned = new StringBuilder();
        for(int i = 0;i<paragraph.length();i++){
            char c = paragraph.charAt(i);
            if((c >= 'a' && c <= 'z') || c == ' '){
                cleaned.append(c);
            }
        }
        String cleanedParagraph = cleaned.toString();
        String[] words = cleanedParagraph.split(" ");
        for(String currString:words){
            insertion(currString);
        }
    }

    public void insertion(String word){
        Node curr = root;
        int len = word.length();
        for (int i = 0; i < len; i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if(curr.children[index] == null){
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        curr.endOfWord = true;
    }
}
