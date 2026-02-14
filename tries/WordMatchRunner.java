package tries;

public class WordMatchRunner {
    public static void main(String[] args) {
        BuildTrie trie = new BuildTrie();
        trie.preProcess("this is amrit");
        boolean ans = WordMatcher.isWordMatched(trie,"is");
        System.out.println(ans);
    }
}
