package binaryconverter;

public class BinaryConverterUsingBitManipulation {
    public static String integerToBinary(int n){
        StringBuilder sb = new StringBuilder();
        for(int i = 31;i>=0;i--){
            sb.append((n >> i) & 1);
        }
        return sb.toString();
    }
}
