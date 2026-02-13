package tries;

public class Main {
    public static void main(String[] args) {
    String[]  words= {"the","there","their","any"};
    Tries obj = new Tries();
        for(int i = 0;i<words.length;i++){
            String s = words[i];
            // s.charAt(s.length()-1) == ',' || 
            obj.insertion(s);
        }
        System.out.println(obj.search("their"));
    }
}
