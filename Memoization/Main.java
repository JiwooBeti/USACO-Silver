import java.util.*;
import java.io.*;

public class Main {
  //static int max = Integer.MAX_VALUE/2;
  public static void main(String[] args) throws Exception {
    //BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    //use long
    
    BufferedReader f = new BufferedReader(new FileReader("Input.in"));
    int t = Integer.parseInt(f.readLine());
    for (int i = 0; i < t; i++) {
        StringTokenizer st = new StringTokenizer(f.readLine());
        long stones = Long.parseLong(st.nextToken());
        int sizes = Integer.parseInt(st.nextToken());
        //System.out.println(n + " " + p);
        int[] ar = new int[sizes];
        int[] dp = new int[Integer.MAX_VALUE / 8];

        //int[] dp = new int[target+10];
        st = new StringTokenizer(f.readLine());
        for (int j = 0; j < sizes; j++) {
            ar[j] = Integer.parseInt(st.nextToken());
        }

        //System.out.println(Arrays.toString(ar));
        System.out.println(f(ar, stones, dp));

    }
    //int[] ar = {2, 3, 4};
    //System.out.println(base(ar, 4) );
  }

  static int f(int[] ar, long stones, int[] dp) {
    if(base(ar, stones)) {
      //System.out.println("\nStopped at " + stones);
      return 0;
    }
    if(stones < dp.length && dp[(int) stones] > 0) {
      return dp[(int) stones];
    }
    int ret = 0;
    for (int i = 0; i < ar.length; i++) {
      if(stones == ar[i]) {
        continue;
      }
      int div = ar[i];
      if(stones % div == 0) {
        //System.out.println("\nStones: " + stones + " Divisor " + div);
        int cnt = (int) (stones / div);
        //this is wrong, you should pass ar[i]
        ret = Math.max(ret, 1 + cnt * f(ar, ar[i], dp));
      }
    }
    if(stones < dp.length) {
      dp[(int) stones] = ret;

    }

    return ret;
    

  }

  static boolean base(int[] ar, long stones) {
    boolean smallest = true;
    boolean rp = true;
    for (int i = 0; i < ar.length; i++) {
      if((ar[i]) < stones) {
        smallest = false;
      }     
    }
    if(smallest) {
      return true;
    }
    for (int i = 0; i < ar.length; i++) {
      if(ar[i] != stones && stones %  ar[i] == 0) {
        rp = false;
      }
    }
    if(rp) {
      return true;
    }
    return false;
  }



  

}
