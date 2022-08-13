import java.util.*;
import java.io.*;
public class WideRanges {
  public static void main(String[] args) throws Exception {
    BufferedReader f = new BufferedReader(new FileReader("Input.in"));
    //BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(f.readLine());
    //System.out.println(n);
    ArrayList<int[]> list = new ArrayList<>();
    for (int i = 0; i <n; i++) {
      StringTokenizer st = new StringTokenizer(f.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int[] ar = new int[b-a];
      for (int j = 0; j < ar.length; j++) {
        ar[j] = a + j;
      }
     // System.out.println(Arrays.toString(ar));
      list.add(ar);
    }
    Collections.sort(list, (a,b)->a[0]-b[0]);
    //System.out.println(list);
    HashSet<Integer> set = new HashSet<>();
    int[] ans = new int[6];
    int max = 0;
    int maxVal = 0;
    int globalMaxVal = 0;
    for (int i = 0; i < list.size(); i++) {
      for (int j = i+1; j < list.size(); j++) {
       for (int k = j+1; k < list.size(); k++) {
        maxVal = Math.max(addVals(list.get(i), set), maxVal);
        maxVal = Math.max(addVals(list.get(j), set), maxVal);
        maxVal = Math.max(addVals(list.get(k), set), maxVal);
        if(set.size()>max) {
          max = set.size();
          if(maxVal > globalMaxVal) {
            globalMaxVal = maxVal;
            ans[0] = list.get(i)[0];
            ans[1] = list.get(i)[list.get(i).length-1]+1;
            ans[2] = list.get(j)[0];
            ans[3] = list.get(j)[list.get(j).length-1]+1;
            ans[4] = list.get(k)[0];
            ans[5] = list.get(k)[list.get(k).length-1]+1;
          }
        }
        set.clear();
       } 
      }
    }
    //System.out.println(max);
    System.out.println(ans[0] + "-" + ans[1] + ", " + ans[2] + "-" + ans[3] + ", " + ans[4] + "-" + ans[5]);
    //10-70, 100-200, 200-250





  }

  static int addVals(int[] ar, HashSet<Integer> set) {
    int max = 0;
    for (int i = 0; i < ar.length; i++) {
      set.add(ar[i]);
      max = Math.max(max, ar[i]);
    }
    return max;
  }

}
