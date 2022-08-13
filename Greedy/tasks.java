import java.util.*;
import java.io.*;

public class tasks {
  public static void main(String[] args) throws Exception {
      BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    //BufferedReader f = new BufferedReader(new FileReader("Input.in"));
    int t = Integer.parseInt(f.readLine());
    for (int u = 0; u < t; u++) {
            
        
        int n = Integer.parseInt(f.readLine());
        int[][] ar = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            ar[i][0] = Integer.parseInt(st.nextToken());
            ar[i][1] = Integer.parseInt(st.nextToken());
        }
    // System.out.println(Arrays.deepToString(ar));

        Arrays.sort(ar, (a,b) -> a[0] - b[0]);


    // System.out.println(Arrays.deepToString(ar));
        int duration = 0;
        int ans = 0;

        for (int i = 0; i < ar.length; i++) {
            duration+= ar[i][0];
            ans+= ar[i][1]-duration;
        }
        System.out.println(ans);

    }
}
}
