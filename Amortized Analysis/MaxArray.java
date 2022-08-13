import java.util.*;
import java.io.*;
public class MaxArray {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader f = new BufferedReader(new FileReader("Input.in"));
        int t = Integer.parseInt(f.readLine());
        for (int i = 0; i < t; i++) {
           // System.out.println("\n-----Case-----");
            StringTokenizer st = new StringTokenizer(f.readLine());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int[] ar = new int[n];
            st = new StringTokenizer(f.readLine());
            for (int j = 0; j < ar.length; j++) {
                ar[j] = Integer.parseInt(st.nextToken());
            }
           // System.out.println(Arrays.toString(ar));
            //what subarray <= than x
            //based on a sum
            //when smaller than sum add to right
            //when bigger than sum remove from left
            int l = 0, r = 1;
            int sum = ar[l];
            int max = 0;
            while(l < ar.length && r <= ar.length) {
                //System.out.println(l + " " + r + " " + sum + " " + max);
                if(sum <= x) {
                    max = Math.max(sum, max);
                }
                if(sum == x) {
                    break;
                }
                if(sum < x) {
                    if(r == ar.length) {
                        break;
                    }
                    sum+= ar[r];
                    r++;

                } 
                else if(sum > x) {
                    sum-= ar[l];
                    l++;
                }

            }
            System.out.println(max);


        }

    }
}
