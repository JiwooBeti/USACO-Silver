import java.util.*;
import java.io.*;

public class RangedSum {
  public static void main(String[] args) throws Exception {
    //BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader f = new BufferedReader(new FileReader("Input.in"));
    int t = Integer.parseInt(f.readLine());
    for (int i = 0; i < t; i++) {
        int n = Integer.parseInt(f.readLine());
        int[] ar = new int[n];
        StringTokenizer st = new StringTokenizer(f.readLine());
        for (int j = 0; j < ar.length; j++) {
            ar[j] = Integer.parseInt(st.nextToken());
        }
        int[] prefix = new int[n+1];
        for (int j = 1; j < prefix.length; j++) {
            prefix[j] = prefix[j-1] + ar[j-1];
        }
        //System.out.println(Arrays.toString(ar));
        //System.out.println(Arrays.toString(prefix));
        int q = Integer.parseInt(f.readLine());
        for (int j = 0; j < q; j++) {
            st = new StringTokenizer(f.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            //System.out.println(a + " " + b);
            System.out.println(prefix[b+1]-prefix[a]);
        }
    }
  }
}
