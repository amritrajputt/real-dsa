import java.util.*;
public class FilterStrings {
    public static void main(String[] args) {
        String[] s = new String[]{"amrit","ashish","bittu","cittu"};
        System.out.println(filter(s));
    }
    private static List <String> filter(String[] strs){
        ArrayList <String> arr = new ArrayList<>();
        for(String s:strs){
            s = s.toLowerCase();
            if(s.startsWith("a")) arr.add(s);
        }
        return arr;
    }
}
