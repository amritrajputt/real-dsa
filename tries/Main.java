package tries;

public class Main {
    public static void main(String[] args) {
    String[]  words= {"the","there","their","any"};
    Tries obj = new Tries();
        for(int i = 0;i<words.length;i++){
            obj.insertion(words[i]);
        }
        System.out.println(obj.search("their"));
    }
}
