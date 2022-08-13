import java.util.*;
import java.io.*;

public class Shuffle {
  public static void main(String[] args) throws Exception {
    BufferedReader f = new BufferedReader(new FileReader("Input.in"));
    int t = Integer.parseInt(f.readLine());
    for (int j = 0; j < t; j++) {
        
        
        int n = Integer.parseInt(f.readLine());
        char[] ar = new char[n];
        StringTokenizer st = new StringTokenizer(f.readLine());
        for (int i = 0; i < n; i++) {
            ar[i] = st.nextToken().charAt(0);
        }
        System.out.println(Arrays.toString(ar));
        int max = 0;
        for (int i = 1; i < ar.length; i++) {
            if(i == ar.length-1) {
                if(!(ar[i] > ar[i-1])) {
                    max = i;
                }
                continue;
            }
            if(!(ar[i] > ar[i-1] && ar[i] < ar[i+1])) {
                max = i;
            }
        }
        System.out.println(max);
        //if the max is the minimum value
    }
  }

}
