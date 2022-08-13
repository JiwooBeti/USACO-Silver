import java.util.*;
import java.io.*;

public class Alt {
  public static void main(String[] args) throws Exception {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    //BufferedReader f = new BufferedReader(new FileReader("Input.in"));
    int t = Integer.parseInt(f.readLine());
    for (int u = 0; u < t; u++) {
            
        
        int n = Integer.parseInt(f.readLine());
        long[] ar = new long[n];
        StringTokenizer st = new StringTokenizer(f.readLine());
        for (int i = 0; i < ar.length; i++) {
            ar[i] = Long.parseLong(st.nextToken());
        }
    // System.out.println(Arrays.toString(ar));
        long sum = 0;
        boolean sign = false;
        long cur = Long.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if(i == 0) {
                sign = ar[i]>0;
            }
            boolean curSign = ar[i]>0;
           // System.out.println(i + " " + curSign);
            if(curSign!=sign) {
                //System.out.println(cur);
                sign = !sign;
                sum+=cur;
                cur=Long.MIN_VALUE;
            }
          
            cur = Math.max(cur, ar[i]);

        }
        sum+= cur;
        System.out.println(sum);
    }
    }
}
