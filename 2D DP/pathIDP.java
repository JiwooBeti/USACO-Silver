import java.io.*;
import java.util.*;
public class pathIDP {
    public static void main(String[] args) throws Exception{
        BufferedReader f = new BufferedReader(new FileReader("Input.in"));
        //BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(f.readLine());
        for (int u = 0; u < t; u++) {   
            int n = Integer.parseInt(f.readLine());
            int[][] grid = new int[n][n];
            int[][] dp = new int[n][n];
            
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(f.readLine());
                for (int j = 0; j < n; j++) {
                    grid[i][j]=Integer.parseInt(st.nextToken());
                }
            }
            dp[n-1][n-1] = grid[n-1][n-1];
            for (int i = n-1; i >= 0; i--) {
                for (int j = n-1; j >= 0; j--) {

                    if(i-1 >= 0) {
                        dp[i-1][j] = Math.max(dp[i][j] + grid[i-1][j], dp[i-1][j]);
                    } 
                    if(j-1>= 0) {
                        dp[i][j-1] = Math.max(dp[i][j] + grid[i][j-1], dp[i][j-1]);
                    }
                    
                }
            }

        // System.out.println(Arrays.deepToString(grid));
         //System.out.println(Arrays.deepToString(dp));
         System.out.println(dp[0][0]);
        }
    
    }
}
