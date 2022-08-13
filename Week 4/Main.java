import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    //BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader f = new BufferedReader(new FileReader("Input.in"));

    int c = Integer.parseInt(f.readLine());
    for(int i = 0; i < c; i++) {
      StringTokenizer st = new StringTokenizer(f.readLine());
      int n = Integer.parseInt(st.nextToken());
      int target = Integer.parseInt(st.nextToken());
      int[] ar = new int[n];
      st = new StringTokenizer(f.readLine());
      //System.out.println("st ");
      for(int j = 0; j < n; j++) {
        ar[j] = Integer.parseInt(st.nextToken());
      }

      //System.out.println("hi");
      //System.out.println(Arrays.toString(ar));

      System.out.println(f(ar, 0, target));
    }
    System.out.println("done");
  }


    //start from smallest
    //move to next after you have reached limit on cur
    static int f(int[] ar, int i, int target) {
      //start from first
      //do attempts for current until you run out
      if(i >= ar.length) {
        if(target == 0) {
          return 1;
        }
        return 0;
      }
      int cnt = 0;
      for(int j = 0; j * ar[i] <= target; j++) {
        //System.out.println(ar[i]);
          cnt+=f(ar, i+1, target - ar[i]*j);
      }
      return cnt;


    }
  
}
