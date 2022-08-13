import java.util.*;
import java.io.*;

public class MakeString {
  public static void main(String[] args) throws Exception {
    //  BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader f = new BufferedReader(new FileReader("Input.in"));
    int t = Integer.parseInt(f.readLine());
    for (int i = 0; i < t; i++) {
        int n = Integer.parseInt(f.readLine());
        StringTokenizer st = new StringTokenizer(f.readLine());
        ArrayList<char[]> list = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            list.add(st.nextToken().toCharArray());
        }

        char[] word = f.readLine().toCharArray();
        char[] dp = new char[word.length];
        //System.out.println(Arrays.toString(dp));
        System.out.println(f(list, 0, word, dp) ? "yes" : "no");

    }
  }

  static boolean f(ArrayList<char[]> list, int i, char[] word, char[] dp) {

   //System.out.println("index " + i);
      if(i == word.length) {
          return true;
      }
      if(dp[i]=='a'||dp[i]=='b') {
        return dp[i]=='a';
      }

      for (int j = 0; j < list.size(); j++) {
          if(works(list, i, j, word) && f(list, i+list.get(j).length, word, dp)) {
            //System.out.println(Arrays.toString(list.get(j)) + " works at indexx " + i);
            dp[i]='a';
            return true;
          }
      }
      dp[i]='b';
      return false;
  }
  static boolean works(ArrayList<char[]> list, int wordIndex, int listIndex, char[] word) {
      char[] cur = list.get(listIndex);
      if(cur.length>word.length-wordIndex+1) {
          return false;
      }
      for (int i = 0; i < cur.length; i++) {
          if(cur[i]!=word[wordIndex+i]) {
              return false;
          }
      }
      //System.out.println("f2 " + Arrays.toString(list.get(listIndex)) + " works at indexx " + wordIndex);
      return true;

  }
}
