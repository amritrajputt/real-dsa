import java.util.*;
import java.math.*;
public class Calculate{
    static BigInteger dp[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int n = sc.nextInt();
        dp = new BigInteger[n+1];
        Arrays.fill(dp,null);
        System.out.println (calculate(n));
    }
    
    private static BigInteger calculate(int x) {
        
        if(x<10){
            return BigInteger.ONE;
        }

        if(dp[x] != null) return dp[x];

        BigInteger cube = BigInteger.valueOf(8L)
                        .multiply(BigInteger.valueOf(x))
                        .multiply(BigInteger.valueOf(x))
                        .multiply(BigInteger.valueOf(x));

        BigInteger ans = cube.add(calculate(x-1)).add(calculate(x-3)) ;
        dp[x] = ans;
        return ans;
    }
}