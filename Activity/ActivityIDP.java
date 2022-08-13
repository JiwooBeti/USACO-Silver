import java.util.*;

class ActivityIDP {
    public static void main(String[] args) {
        int n = 4;
        int ar[] = {1,3,2,0};
        int[][] dp = new int[3][n];
        for(int[] row : dp) {
            System.out.println(Arrays.toString(row));
        }

        for(int i = 0; i <= n; i++) {
            if(dp[0][i] >= 0) {
                dp[0][i+1] = Math.min(1 + dp[0][i], dp[0][i+1]);
                if(ar[i] == 1 || ar[i] == 3) {
                    Math.min(1 + dp[0][i], dp[0][i+1]);
                } 
                if(ar[i] == 2 || ar[i] == 3) {
                    dp[2][i+1] = Math.min(dp[0][i], dp[2][i+1]);
                }
            }
        }

    }
}