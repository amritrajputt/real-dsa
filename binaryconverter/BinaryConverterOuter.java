package binaryconverter;
public class BinaryConverterOuter {
    static class ConvertToBinaryInner {
        public static String BinaryConverter(int n) {
            if (n == 0)
                return "0";
            String s = new String();
            while (n > 0) {
                int rem = n % 2;
                s += rem;
                n = n / 2;
            }
            return reverse(s);
        }
    }
    private static String reverse(String s){
        String str = "";
        for(int i= 0;i<s.length();i++){
            str = s.charAt(i)+str; 
        }
        return str;
    }
}