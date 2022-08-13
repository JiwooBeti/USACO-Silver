import java.util.Arrays;

public class pathIDP {
  public static void main(String[] args) {

    int[][] ar = {
        { 0, 0, 0, 0, 0, 0 },
        { 0, 3, 7, 9, 2, 7 },
        { 0, 9, 8, 3, 5, 5 },
        { 0, 1, 7, 9, 8, 5 },
        { 0, 3, 8, 6, 4, 10 },
        { 0, 6, 3, 9, 7, 8 } };

    int[][] dp = new int[6][6];

    // backward DP
    for (int r = 5; r >= 1; r--) {
      for (int c = 5; c >= 1; c--) {
        dp[r][c] = Math.max(dp[r][c+1], dp[r][c+1]) + ar[r][c];
      }
    }

    for (int[] row : dp)
      System.out.println(Arrays.toString(row));

  }
}