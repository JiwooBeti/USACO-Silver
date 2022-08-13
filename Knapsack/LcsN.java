import java.util.*;
import java.io.*;
public class LcsN {

    public static void main(String[] args) throws Exception {
        //BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        
       BufferedReader f = new BufferedReader(new FileReader("Input.in"));
        int t = Integer.parseInt(f.readLine());
        for (int i = 0; i < t; i++) {
            f.readLine();
            char[] a = f.readLine().toCharArray();
            char[] b = f.readLine().toCharArray();
            //System.out.println(Arrays.toString(b));
            int[][] dp = new int[a.length][b.length];
            System.out.println(f(a, b, 0, 0, dp, "", 0));
        }
    }

    static int f(char[] a, char[] b, int aI, int bI, int[][] dp, String s, int ans) {
        if(s.length()>0) {
            //System.out.println(s + " " + ans);
        }
        if(ans >= 6) {
            //System.out.println(s);
        }
        if(aI==a.length || bI == b.length) {
            return 0;
        }
        if(s.equals("HELLOB")) {
            System.out.println(a[aI] +" " + b[bI]);
            System.out.println("hi" + dp[aI][bI] + " " + ans);
        }
        if(dp[aI][bI] != 0) {
            return dp[aI][bI];
        }
        if(a[aI]==b[bI]) {
            dp[aI][bI]= Math.max(
                1+f(a, b, aI+1, bI+1, dp, s + a[aI], ans+1), 
                    Math.max(
                        f(a, b, aI+1, bI, dp, s, ans), 
                        f(a, b, aI, bI+1, dp, s, ans)
                        )
            );

            //System.out.println(a[aI] + " " + aI +" " + bI + " " + dp[aI][bI]);
        }
        else {
         dp[aI][bI]=Math.max(
            f(a, b, aI+1, bI, dp, s, ans), 
            f(a, b, aI, bI+1, dp, s, ans)
            );
        }

        return dp[aI][bI];
    }

    


}