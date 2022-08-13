import java.util.*;
import java.io.*;

public class KnapsackDP {
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

          //


       }
  }
}