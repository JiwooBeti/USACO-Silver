import java.util.*;
import java.io.*;
public class HasABC {
    public static void main(String[] args) throws IOException {
        //BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader f = new BufferedReader(new FileReader("Input.in"));
        int t = Integer.parseInt(f.readLine());

        for(int u = 0; u < t; u++) {
            //System.out.println("----NEW CASE---");

            f.readLine();
            char[] ar = f.readLine().toCharArray();
            //System.out.println(ar);
            int l = 0, r=1;
            int a=0, b=0, c=0;
            int min = Integer.MAX_VALUE;
            int minIndex = 0;
            //didnt check case 13
            if(ar[l]=='a') {
                a++;
            } else if(ar[l] == 'b') {
                b++;
            } else if(ar[l] =='c') {
                c++;
            }
            while(l < ar.length && r <= ar.length) {
                //System.out.println(l + " " + r + " " + a + " " + b + " " + c);
                if(hasEnough(a, b, c)) {
                    if(r-l < min) {
                        min = r-l;
                        minIndex=l;
                    }
                    if(ar[l]=='a') {
                        a--;
                    } else if(ar[l] == 'b') {
                        b--;
                    } else if(ar[l] =='c') {
                        c--;
                    }
                    l++;
                } else {
                    if(r == ar.length) {
                        break;
                    }
                    if(ar[r]=='a') {
                        a++;
                    } else if(ar[r] == 'b') {
                        b++;
                    } else if(ar[r] =='c') {
                        c++;
                    }
                    r++;
                }

            }

           // System.out.println(min);
            //System.out.println(minIndex);
            for (int i = minIndex; i < min+minIndex; i++) {
                System.out.print(ar[i]);
            }
            System.out.println();
        }
    }
    static boolean hasEnough(int a, int b, int c) {
        return a >= 1 && b >= 1 && c >= 1;
    }
}

/* 
13
zzaczbzzzazzz
13
btreequizbanc
21
btreeacademyisthebest
13
abdfcdfacdbyj
 */
