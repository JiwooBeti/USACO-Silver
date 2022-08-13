import java.util.*;
import java.io.*;
public class EditDistance2 {
    static int MAX_VAL = Integer.MAX_VALUE/3;
    public static void main(String[] args) throws Exception {
        //BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader f = new BufferedReader(new FileReader("Input.in"));
        int t = Integer.parseInt(f.readLine());
        for (int i = 0; i < t; i++) {
            f.readLine();
            char[] a = f.readLine().toCharArray();
            char[] b = f.readLine().toCharArray();
            //f(a, b, a.length-1, b.length-1);
            System.out.println(f(a, b, a.length-1, b.length-1));
        }
    }

    static int f(char[] a, char[] b, int aI, int bI) {
        if((aI==0 && bI==-1) ||( aI == -1 && bI==0)) {
            return 1;
        }
        if(aI<0 || bI<0) {
            return MAX_VAL;
        }
        if(aI == 0 && bI==0) {
            //System.out.println("\n\n------new\n"+s);
            if(a[aI]==b[bI]) {return 0;}
            return 1;
            //on the last one b and t are unequal
        }
        //insert, remove, change
         return Math.min(
            1+f(a, b, aI, bI-1),
                Math.min(
                    1+f(a,b,aI-1, bI), 
                    f(a,b,aI-1,bI-1) + (a[aI]==b[bI] ? 0:1)));

    }
    
}

