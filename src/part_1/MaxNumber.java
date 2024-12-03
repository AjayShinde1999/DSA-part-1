package part_1;

import java.util.Arrays;

public class MaxNumber {
    public static void main(String[] args) {
        int[] nums = {100, 4, 1, 5, 10, 7, 24};
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println(max);

        // using steam
        int asInt = Arrays.stream(nums).max().getAsInt();
        System.out.println(asInt);


    }
}
