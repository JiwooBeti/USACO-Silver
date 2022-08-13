import java.util.*;
import java.io.*;
public class N {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader f = new BufferedReader(new FileReader("Input.in"));
        int t = Integer.parseInt(f.readLine());
        for (int u = 0; u < t; u++) {
                
            
            int n = Integer.parseInt(f.readLine());
            int[] ar = new int[n];
            StringTokenizer st = new StringTokenizer(f.readLine());
            for (int i = 0; i < n; i++) {
                ar[i] = Integer.parseInt(st.nextToken());
            }
           // System.out.println(Arrays.toString(ar));
            System.out.println(f(ar, 0, -1));
            //System.out.println(f());
        }

    }
    static int f(int[] ar, int i, int prev) {
        if(i >= ar.length) {
            return 0;
        }
        if(ar[i] == 0) {
            return 1 + f(ar, i+1, ar[i]);
        }
        if(ar[i] == 1 || ar[i] == 2) {
            if(prev == ar[i]) {
                return 1 + f(ar, i+1, 0);
            }
            return Math.min(f(ar, i+1, ar[i]), 1 + f(ar, i+1, 0));
        }
        if(prev == 0) {
            return  Math.min(f(ar, i+1, 2), Math.min(f(ar, i+1, 1), 1 + f(ar, i+1, 0)));
        }
        if(prev == 1) {
            return Math.min(f(ar, i+1, 2), 1 + f(ar, i+1, 0) );
        }
                    return Math.min(f(ar, i+1, 1), 1 + f(ar, i+1, 0) );


        //return Math.min(f(ar, i+1, 3), Math.min(f(ar, i+1, 2), Math.min(f(ar, i+1, 1), 1 + f(ar, i+1, 0))));


    }
}
