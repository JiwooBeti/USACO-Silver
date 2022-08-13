import java.util.*;
import java.io.*;
public class knightsTour {
    public static void main(String[] args) throws Exception {
        grid = new int[8][8];
        f(0,0,1);
        for (int[] row : grid) {
            System.out.println(Arrays.toString(row));
        }

        
    }

    static int[][] grid;
    static int[] dx = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

    static boolean f(int x, int y, int cnt) {
        System.out.println("\n------New------\n");
        System.out.println(cnt + " " + x + " " + y);
        grid[y][x]=cnt;
        //for (int[] row : grid) {
            //System.out.println(Arrays.toString(row));
        //}
       // System.out.println(x + " " + y);
        if(cnt == 64) {
            return full();
        }

        boolean work = false;
        for (int i = 0; i < 8; i++) {
            if(!taken(x+dx[i], y+dy[i])) {
                x=x+dx[i];
                y = y+dy[i];
                work = f(x, y, cnt+1);
                if(!work) {
                    x = x-dx[i];
                    y = y-dy[i];
                }
            }
        }
        if(!work) {
            grid[y][x] = 0;
        }
        return work;
        
    }
    static boolean taken(int x, int y) {
        if(x >= 8 || y >= 8 || x < 0 || y < 0) {
            return true;
        }
        return grid[y][x]!= 0;
    }

    static boolean full() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if(grid[i][j]==0) {
                    return false;
                }
            }
        }
        return true;
    }
}
