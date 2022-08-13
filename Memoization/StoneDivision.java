import java.util.*;
import java.io.*;

public class StoneDivision {

    static long[] dp;
    static int MAX_VAL = Integer.MAX_VALUE / 20;
  public static void main(String[] args) throws Exception {
    //BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader f = new BufferedReader(new FileReader("Input.in"));
    int t = Integer.parseInt(f.readLine());
    for (int i = 0; i < t; i++) {
        StringTokenizer st = new StringTokenizer(f.readLine());
        long n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        long[] ar = new long[p];
        dp = new long[MAX_VAL];
        st = new StringTokenizer(f.readLine());
        for (int j = 0; j < ar.length; j++) {
            ar[j] = Long.parseLong(st.nextToken());
        }
        //System.out.println(Arrays.toString(ar));
        //-----END OF INPUT PROCESSING-----
        System.out.println(solve(ar, n));

    }

  }

  static long solve(long[] ar, long total) {
      if(total < (long) MAX_VAL && dp[(int) total] != 0) {
          return dp[(int) total];
      }
      long ret = 0;
      for (int i = 0; i < ar.length; i++) {
          if(total%ar[i]==0 && total != ar[i]) {
              //divisible
              ret = Math.max(ret, 1 + (total/ar[i]) * solve(ar, ar[i]));
          }
      }
      if(total < (long) MAX_VAL) {
        dp[(int) total] = ret;
      }
      return ret;
  }
}
