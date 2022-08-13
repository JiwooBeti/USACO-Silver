import java.util.Arrays;

public class ps2d {
 public static void main(String[] args) {
    int[][] ar = {
        {1, 3, 2, 4},
        {5, 4, 3, 2},
        {1, 1, 1, 2},
        {0, 1, 2, 0},
      };

      //int[][] ps = new int[4][4];

      int[][] ps = {{1,4,6,10}, {6,0,0,0} , {7,0,0,0
},{7,0,0,0}};

    ps[0][0] = ar[0][0];

    for(int i = 1; i < 4; i++) {
        ps[0][i] = ps[0][i-1] + ar[0][i];
    }

    for(int i = 1; i < 4; i++) {
        ps[i][0] = ps[i-1][0] + ar[i][0];
    }

      for (int i = 1; i < ps.length; i++) {
          for (int j = 1; j < ps[0].length; j++) {
              ps[i][j] = ar[i][j];
              ps[i][j] += ps[i-1][j];
              ps[i][j] += ps[i][j-1];
              ps[i][j] -= ps[i-1][j-1];
          }
      }

      for(int[] row : ps) {
        System.out.println(Arrays.toString(row));
      }
 }   
}
