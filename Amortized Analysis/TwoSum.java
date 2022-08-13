import java.util.*;
import java.io.*;
class TwoSum {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader f = new BufferedReader(new FileReader("Input.in"));
        int t = Integer.parseInt(f.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int[] ar = new int[n];
            st = new StringTokenizer(f.readLine());
            for (int j = 0; j < n; j++) {
                ar[j] = Integer.parseInt(st.nextToken());
            }
           // System.out.println(Arrays.toString(ar));
            int l = 0, r = n-1;
            boolean broken = false;
            while(l <= r) {
                int sum =ar[l] + ar[r];
                if(sum == x) {
                    System.out.println("YES");
                    broken = true;
                    break;
                } else if(sum < x) {
                    l++;
                } else {
                    r--;
                }            
            }
            if(!broken) {
                System.out.println("NO");
            }
        }
    }
}