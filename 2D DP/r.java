import java.util.*;
import java.io.*;

public class r {
  public static void main(String[] args) throws Exception {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(f.readLine());
    for(int i = 0; i < t;  i++) {
      int n = Integer.parseInt(f.readLine());
      int[] ar = new int[n];
      StringTokenizer st = new StringTokenizer(f.readLine());
      for(int j = 0; j < n; j++) {
        ar[j] = Integer.parseInt(st.nextToken());
      }
      System.out.println(ar[ar.length/2]);
    }
  }
}
