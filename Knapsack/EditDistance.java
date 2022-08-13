import java.util.*;
import java.io.*;
public class EditDistance {
    static int MAX_VAL = Integer.MAX_VALUE/3;
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("Input.in"));
        int t = Integer.parseInt(f.readLine());
        for (int i = 0; i < t; i++) {
            f.readLine();
            char[] a = f.readLine().toCharArray();
            char[] b = f.readLine().toCharArray();
            f(a, b, a.length-1, b.length-1, "");
            //System.out.println(f(a, b, a.length-1, b.length-1, ""));
        }
    }

    static int f(char[] a, char[] b, int aI, int bI, String s) {
        if(aI<0 || bI<0) {
            return MAX_VAL;
        }
        if(aI == 0 && bI==0) {
            System.out.println("\n\n------new\n"+s);
            if(a[aI]==b[bI]) {return 0;}
            return 1;
        }
        //insert, remove, change

        if(a[aI]==b[bI]) {
            //return f(a, b, aI-1, bI-1);
            return Math.min(
                        1+f(a, b, aI, bI-1, s + "rem2"),
                        Math.min(
                            1+f(a,b,aI-1, bI, s + "rem1"), 
                            f(a,b,aI-1,bI-1, s + "none")));
        }
        return Math.min(
            1+f(a, b, aI, bI-1, s+"rem2"),
             Math.min(
                 1+f(a,b,aI-1, bI, s + "rem1"), 
                 1+f(a,b,aI-1,bI-1, s + "chan")));


    }
    
}
