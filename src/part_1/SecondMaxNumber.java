package part_1;

public class SecondMaxNumber {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 4, 1, 3, 30};
        System.out.println(secondMax(arr));
    }

    public static int secondMax(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        return secondMax;

    }
}
