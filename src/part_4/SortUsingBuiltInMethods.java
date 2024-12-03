package part_4;

import java.util.Arrays;

public class SortUsingBuiltInMethods {
    public static void main(String[] args) {
        int[] x = {2,3,1,5,0,4};

        // Approach 1
//        Arrays.parallelSort(x);
//        System.out.println(Arrays.toString(x));

        // Approach 2
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
    }
}
