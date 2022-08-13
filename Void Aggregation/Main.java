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
      int t = Integer.parseInt(st.nextToken());
      int[] ar = new int[n];
      st = new StringTokenizer(f.readLine());
      for(int j = 0; j < n; j++) {
        ar[j] = Integer.parseInt(st.nextToken());
      }
      System.out.println(f(ar, 0, t, 0));
    }
  }

  public static int f(int[] ar, int i, int total, int cnt) {
    if(i == ar.length) {
      return (total == 0 && cnt % 2 == 0) ? 1 : 0;
    }
    int ans = 0;
    for(int j = 0; j * ar[i]<= total; j++) {
        System.out.println(j);
      ans+= f(ar, Math.max(j, 1), total - j * ar[i], cnt + i);
    }
    return ans;



  }
}
