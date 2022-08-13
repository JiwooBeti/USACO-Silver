import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    //BufferedReader f = new BufferedReader(new FileReader("Input.in"));
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
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
    // System.out.println(Arrays.deepToString(grid));
        System.out.println(f(grid, 0, 0, dp));
    }
  }
  static int f(int[][] grid, int x, int y, int[][] dp) {
      if(x >= grid.length || y >= grid.length) {
        return Integer.MIN_VALUE;
      }
      if(x == grid.length-1 && y == grid.length-1) {
        return grid[x][y];
      }
      if(dp[x][y]>0) {
          return dp[x][y];
      }

    dp[x][y]=grid[x][y] +  Math.max(f(grid, x+1, y, dp), f(grid,x, y+1, dp));
      return dp[x][y];
  }
}
