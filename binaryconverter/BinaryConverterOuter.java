package binaryconverter;
public class BinaryConverterOuter {
    static class ConvertToBinaryInner {
        public static String BinaryConverter(int n) {
            if (n == 0)
                return "0";
            StringBuilder sb = new StringBuilder();
            while (n > 0) {
                int rem = n % 2;
                sb.append(rem);
                n = n / 2;
            }
            return sb.reverse().toString();
        }
    }
}