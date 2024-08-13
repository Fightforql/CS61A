package lec2;
import java.util.Arrays;

public class dp1 {
    public int coinChange(int[] coins, int amount) {
        int size=coins.length;
        int dp[]=new int[10001];
        dp[0]=0;
        for(int i=1;i<=amount;i++)
            dp[i]=99999;
        Arrays.sort(coins);
        for(int i=1;i<=size;i++)
        {
            for(int j=coins[i-1];j<=amount;j++)
            {
                dp[j]=Math.min(dp[j],dp[j-coins[i-1]]+1);
            }
        }
        if(dp[amount]!=99999)
            return dp[amount];
        else
            return -1;
    }
}
