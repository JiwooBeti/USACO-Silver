import java.util.*;
import java.io.*;

public class Knapsack {
  public static void main(String[] args) throws Exception {
      BufferedReader f = new BufferedReader(new InputStreamReader(System.in));

      int t = Integer.parseInt(f.readLine());
      for (int i = 0; i < t; i++) {
          StringTokenizer st = new StringTokenizer(f.readLine());
          int n = Integer.parseInt(st.nextToken());
          int s = Integer.parseInt(st.nextToken());
          int[] weights = new int[n];
          int[] vals = new int[n];
          
          for (int j = 0; j < vals.length; j++) {
              st = new StringTokenizer(f.readLine());
              weights[j] = Integer.parseInt(st.nextToken());
              vals[j] = Integer.parseInt(st.nextToken());
          }
          //System.out.println(Arrays.toString(weights));
        //System.out.println(Arrays.toString(vals));
          //----END INPUT PROCESSING

          System.out.println(f(weights, vals, 0, s));

       }
  }
  static int f(int[] weights, int[] vals, int i, int capacity) {
    if(i == vals.length) {
        return 0;
    }

    if(capacity<=0) {
        return 0;
    }

    if(capacity-weights[i] < 0) {
        return f(weights, vals, i+1, capacity);
    } else {
        return Math.max(vals[i]+f(weights, vals, i+1, capacity-weights[i]), f(weights, vals, i+1, capacity));
    }

  }
}
