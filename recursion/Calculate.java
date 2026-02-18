public class Calculate{
    public static void main(String[] args) {
        System.out.println (calculate(100));
    }
    private static long calculate(int x) {
        if(x<10){
            return 1;
        }
        long ans = ((long) Math.pow((2.0*x), 3.0)) + calculate(x-1) + calculate(x-3) ;
        return ans;
    }
}