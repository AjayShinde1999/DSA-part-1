package part_1;

import java.util.Arrays;

public class MinNumber {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 7, 9, 10, 1};
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println(min);

        // using stream
        int i = Arrays.stream(nums).min().getAsInt();
        System.out.println(i);
    }
}
