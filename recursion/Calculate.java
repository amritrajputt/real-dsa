import java.util.*;
public class Calculate{
    static long dp[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new long[n+1];
        Arrays.fill(dp,-1);
        System.out.println (calculate(n));
    }
    private static long calculate(int x) {
        if(x<10){
            return 1;
        }
        if(dp[x] != -1) return dp[x];
        long ans = ((long) Math.pow((2.0*x), 3.0)) + calculate(x-1) + calculate(x-3) ;
        dp[x] = ans;
        return ans;
    }
}