package binaryconverter;

public class BinaryConverter {
    public static String decimalToBinaryConverter(long n) {
        if (n == 0)
            return "0";
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            long rem = n % 2;
            sb.append(rem);
            n = n / 2;
        }
        return sb.reverse().toString();
    }

    public static String negativeIntegerToBinary(int n) {
        long positive = Math.abs((long) n);
        String positiveNumberBinary = decimalToBinaryConverter(positive);
        StringBuilder one = new StringBuilder();
        while (positiveNumberBinary.length() < 32) {
            positiveNumberBinary = "0" + positiveNumberBinary;
        }
        for (int i = 0; i < positiveNumberBinary.length(); i++) {
            char c = positiveNumberBinary.charAt(i);
            if (c == '1') {
                one.append(0);
            } else {
                one.append(1);
            }
        }
        int carry = 1;
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = one.length() - 1; i >= 0; i--) {
            char c = one.charAt(i);
            sum = (c - '0') + carry;
            sb.append(sum % 2);
            carry = sum / 2;
        }
        return sb.reverse().toString();
    }
    private static String decimalToBinaryString(double n){
        long positive = (long) Math.abs(n);
        String positiveBinary = decimalToBinaryConverter(positive); 
        StringBuilder sb = new StringBuilder();
        double decimal = n - positive;
        while (decimal > 0){
            decimal *= 2;
            int bit = (int) decimal;
            sb.append(bit);
            decimal = decimal - bit;
        }
        positiveBinary  = positiveBinary+"."+sb;
        return positiveBinary;
    }
}
