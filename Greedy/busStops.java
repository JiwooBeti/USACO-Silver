import java.util.*;
import java.io.*;

public class busStops {
  public static void main(String[] args) throws Exception {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    //BufferedReader f = new BufferedReader(new FileReader("Input.in"));
    int t = Integer.parseInt(f.readLine());
    for (int i = 0; i < t; i++) {
        StringTokenizer st = new StringTokenizer(f.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] ar = new int[n];
        st = new StringTokenizer(f.readLine());
        for (int j = 0; j < ar.length; j++) {
            ar[j] = Integer.parseInt(st.nextToken());   
        }
        //------INPUT PROCESSING-------
        //System.out.println(Arrays.toString(ar));
        int[] leave = new int[n];
        int inside = 0;
        int cnt = 0;
        for (int j = 0; j < ar.length; j++) {
           // System.out.println("Stop " + (j+1) + " inside " + inside);
            inside-= leave[j];
            //System.out.println(leave[j] + " leave");
            int add = Math.min(c - inside, ar[j]);
            inside+= add;
            cnt+= add;
            //System.out.println(add + " added");
            if(j + 2 < ar.length) {
                leave[j+2] = add;
            }
        }
        System.out.println(cnt);
    }
   
  }
}
