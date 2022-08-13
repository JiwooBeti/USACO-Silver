import java.util.*;
import java.io.IOException;
import java.math.*;
class Bagu {
    public static void main(String[] args) throws IOException {
        int[] coins = {1,3,3,5};
        //System.out.println(        fn(coins, 0, 0));
        System.out.println(f("", 3, 1));
        
    }

    static int fn(int[] ar, int i, int cnt) {
        //print all sums
        if(i == ar.length) {
            if(cnt==8)
                return 1;
            return 0;
        }
        return fn(ar, i+1, cnt+ar[i]) + fn(ar,i+1, cnt);
    }

    static int f(String pin, int digits, int first) {
        if(digits == 0) {
            System.out.println(pin);
            return 1;
        }
        int cnt = 0;
        for (int i = first; i <= 9; i++) {
            cnt+=f(pin+i, digits-1, i+1);
        }   
        return cnt;


    }
}