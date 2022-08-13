import java.util.*;
import java.io.*;
public class SlidingWindow {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("Input.in"));
        int t = Integer.parseInt(f.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[] ar = new int[n];
            boolean[] removed = new boolean[n];
            ArrayList<Integer> window = new ArrayList<>();
            st = new StringTokenizer(f.readLine());
            int r = k; int l = 0;
            for (int j = 0; j < r; j++) {
                int cur = Integer.parseInt(st.nextToken());
                ar[j] = cur;
                window.add(cur);
                for(int c = window.size()-2; c >= 0; c--) {
                    if(window.get(c) > window.get(window.size()-1)) {
                        window.remove(c);
                    }
                }
                System.out.println(window);
            }

            for (int j = 0; j < args.length; j++) {
                
            }
            //System.out.println(Arrays.toString(ar));

        }
    }

}
