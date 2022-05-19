import java.util.*;
import java.io.*;
class Sorting {
    public static void main(String[] args) {
            int[][] ar = {{1, 2, 3, 4}, {5}, {6,7,8}};
            sort1(ar);

            ArrayList<String> list = new ArrayList<>();
            list.add("seal");
            list.add("apple");
            list.add("bricks");
            list.add("at");
            sort2(list);

            int[][] ar3 = {{1,5,4}, {1,2,0}};
            sort3(ar3);

            int[][] ar4 = {
                {1, 2},
                {5, 5},
                {1, 1}
            };
            sort4(ar4);

            /* {1, 9}, {3, 3}, {3, 4}*/
            HashSet<Integer> s1 = new HashSet<>();
            s1.add(1);s1.add(9);
            HashSet<Integer> s2 = new HashSet<>();
            s2.add(3);s2.add(3);
            HashSet<Integer> s3 = new HashSet<>();
            s3.add(3);s3.add(4);

            HashSet<Integer>[] set = {s1, s2, s3};
    }

    static void sort1(int[][] ar) {
        //sort by inc length
        Arrays.sort(ar, (a,b) -> a.length - ar.length);
        for(int[]  row : ar) {
            //System.out.println(Arrays.toString(ar));
        }

    }

    static void sort2(ArrayList<String> strings) {
        //Sort strings in the order of decreasing size.
        Collections.sort(strings, (a,b) -> b.length() - a.length());
        System.out.println(strings);
    }

    static void sort3(int[][] ar) {
        //Sort each row of a 2D array
        for(int[] row : ar) {
            Arrays.sort(row);
        }

        printAr(ar);
    }

    static void sort4(int[][] pts) {
        //A 2D array exists to represent points on a 2D plane. 
        //Sort it by their respective distances from the origin.

        Arrays.sort(pts, (a,b) -> (a[0] + a[1]) - (b[0]+b[1]));
        printAr(pts);
    }

    static void sort5(HashSet<Integer>[] set) {
        Arrays.sort(set, (a,b) -> findMax(a) - findMax(b));

        System.out.println(Arrays.toString(set));
    }

    static void printAr(int[][] ar) { {
        System.out.println("Printing----");
        for(int[] row : ar) {
            System.out.println(Arrays.toString(row));
        }
    }

    }

    static int findMax(HashSet<Integer> s) {
        int max = Integer.MIN_VALUE;
        for(int i : s) {
            max = i > max ? i : max;
        }

        return max;

    }

    
}