package myProject.DT.algorihtms.in_place;

import java.util.*;

public class Example1 {
    // suppose we have an array of integers n, and task says to return reversed version of this array.


    // possible solutions:

    // 1.
    // we can allocate a space for a new array, and then store elements from original
    // array to a new-created one in required order.

    public int[] reverse (int[] n) { // input
        int[] newArray = new int[n.length]; // new array is created

        for (int i = 0; i < n.length; i++) {
            newArray[n.length-1-i] = n[i]; // storing elements form original array in reverse order
        }

        return newArray; // output
    }

    // above solution requires O(n.length) extra memory, since new array is allocated


    // 2.
    // solving this problem using in-place algorithm
    // in-place means we modify original input and then return it changed. No new arrays are needed.
    // but some auxiliary space for temporal variables is allowed to be allocated,
    // in this example variables i and tmp

    public int[] reverse_in_place(int[] n) {
        int tmp = 0;
        for (int i = 0; i <= Math.floor(((double) n.length - 2) / 2); i++) {
            tmp = n[i];
            n[i] = n[n.length-1-i];
            n[n.length-1-i] = tmp;
        }
        return n;
    }

    // latter solution requires only O(2) space memory, since variables tmp and i are used.
    // note: input doesn't count for memory
}


class Main {
    public static void main(String[] args) {
        Example1 example1 = new Example1();

        int[] arr = new int[] {1,2,3,4,5,6,7,8};

        System.out.println("example1.reverse(arr) = " + Arrays.toString(example1.reverse(arr)));
        System.out.println("arr = " + Arrays.toString(arr) + " // didn't change"); // since previous method is not using in-place algorithm, arr doesn't change

        System.out.println("example1.reverse_in_place(arr) = " + Arrays.toString(example1.reverse_in_place(arr)));
        System.out.println("arr = " + Arrays.toString(arr) + " // changed"); // but there, it's changed
    }
}