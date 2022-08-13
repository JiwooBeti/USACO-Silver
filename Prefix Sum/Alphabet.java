import java.util.*;
import java.io.*;

public class Alphabet {
  public static void main(String[] args) throws Exception {
    //BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader f = new BufferedReader(new FileReader("Input.in"));
    int t = Integer.parseInt(f.readLine());
    for (int i = 0; i < t; i++) {
        StringTokenizer st = new StringTokenizer(f.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        char[] letters = f.readLine().toCharArray();
        //System.out.println(Arrays.toString(letters));
        //do a prefix sum of the entire thing
        //  n days, 26 letters
        // A = 65
        int[][] cnt = new int[n+1][26];
        for (int j = 0; j < letters.length; j++) {
            
            for(int k = j; k < n; k++) {
                cnt[k+1][letters[j]-65]++;
            }
        }
        //printGrid(cnt);
        for (int j = 0; j <q; j++) {
            st = new StringTokenizer(f.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            printLine(cnt[a], cnt[b+1]);
        }

    }
  }
  /*static void printGrid(int[][] ar ) {
      for (int i = 0; i < ar.length; i++) {
          System.out.println(Arrays.toString(ar[i]));
          System.out.println();
      }
  }*/
  static void printLine(int[] a, int[] b) {
    for (int i = 0; i < b.length; i++) {
        System.out.print((b[i]-a[i]) + "-");
    }
    System.out.println();
  } 
}
