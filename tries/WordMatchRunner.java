package tries;

public class WordMatchRunner {
    public static void main(String[] args) {
        BuildTrie trie = new BuildTrie();
        trie.preProcess("this is amrit, he is in 6th sem, he/him");
        boolean ans = WordMatcher.isWordMatched(trie,"he/him");
        System.out.println(ans);
    }
}
