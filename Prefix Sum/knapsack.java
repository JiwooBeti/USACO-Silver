import java.util.Arrays;

public class knapsack {
    public static void main(String[] args) {
        int[] w = {1,3,3,4};
        int[][] grid = new int[w.length+1][20];
        grid[0][0]=1;

        for (int i = 0; i < grid.length-1; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]!=0) {
                    grid[i+1][j+w[i]] = 1;
                    grid[i+1][j] = 1;
                }
            }
        }
        System.out.println(Arrays.deepToString(grid));
    }
}
