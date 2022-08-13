import java.util.*;
import java.io.*;
public class TwoDArray {
    public static void main(String[] args) throws Exception {
        //BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader f = new BufferedReader(new FileReader("Input.in"));
        int t = Integer.parseInt(f.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            int[][] grid = new int[r][c];
            for (int j = 0; j < grid.length; j++) {
                st = new StringTokenizer(f.readLine());
                for (int j2 = 0; j2 < grid[0].length; j2++) {
                    grid[j][j2] = Integer.parseInt(st.nextToken());
                }
            }
            //System.out.println(Arrays.deepToString(grid));
            int[][] prefix = new int[r][c];
            for (int j = 0; j < grid.length; j++) {
                for (int j2 = 0; j2 < grid[0].length; j2++) {
                    prefix[j][j2] = grid[j][j2];
                    if(j > 0) {
                        prefix[j][j2]+= prefix[j-1][j2];
                    }
                    if(j2 > 0) {
                        prefix[j][j2]+= prefix[j][j2-1];
                    }
                    if(j>0 && j2>0) {
                        prefix[j][j2]-= prefix[j-1][j2-1];
                    }
                }
            }
           // System.out.println(Arrays.deepToString(prefix));
            for (int j = 0; j < q; j++) {
                st = new StringTokenizer(f.readLine());
                int ay = Integer.parseInt(st.nextToken());
                int ax = Integer.parseInt(st.nextToken());
                int by = Integer.parseInt(st.nextToken());
                int bx = Integer.parseInt(st.nextToken());
                //y,x
                int sum = prefix[by][bx];
                if(ay-1>=0) {sum-= prefix[ay-1][bx];}
                if(ax-1>=0) {sum-= prefix[by][ax-1];}
                if(ay-1>=0 && ax-1>=0) {sum+= prefix[ay-1][ax-1];}
                System.out.println(sum);

                
            }
        }
    }
}