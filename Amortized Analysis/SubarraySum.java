import java.util.*;
import java.io.*;
public class SubarraySum {
    public static void main(String[] args) throws Exception {
        //BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader f = new BufferedReader(new FileReader("Input.in"));
        int t = Integer.parseInt(f.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(f.readLine());
            int[] ar = new int[n];
            for (int j = 0; j < ar.length; j++) {
                ar[j] = Integer.parseInt(st.nextToken());
            }
            //System.out.println(Arrays.toString(ar));
            //1 3 2 5 1 1 2 3 9
            //if sum == x done
            //if sum < x move right border 1
            //if sum > x move left border 1
            int l = 0, r = 1;
            int sum = ar[l];
            boolean broken = false;
            while(l < ar.length && r <= ar.length) {
                //System.out.println(l+ " " + r + " " + sum);
                if(sum == x) {
                    //done
                    for (int j = l; j < r; j++) {
                        System.out.print(ar[j] + ",");
                    }
                    System.out.println();
                    broken = true;
                    break;
                } else if(sum > x) {
                    sum-=ar[l];
                    l++;
                } else {
                    if(r == ar.length) {
                        break;
                    }
                    sum+= ar[r];
                    r++;
                }
            }
            if(!broken) {
                System.out.println(-1);
            }
            //System.out.println();
        }

    }
}
