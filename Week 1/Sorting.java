import java.util.*;
import java.io.*;
class Sorting {
    public static void main(String[] args) {
        /*[
                [ 1, 2, 3, 4 ],
                [ 5 ],
                [ 6, 7, 8]
            ]

            should become

            [
                [ 5 ],
                [ 6, 7, 8]
                [ 1, 2, 3, 4 ],
            ]
            sort by inc order
            */

            int[][] ar = {{1, 2, 3, 4}, {5}, {6,7,8}};
            sortIt(ar);
    }

    static void sortIt(int[][] ar) {
        Arrays.sort(ar, (a,b) -> a.length - ar.length);
        for(int[]  row : ar) {
            System.out.println(Arrays.toString(row));
        }

    }
}