package algoprep_video_11;

// Given N array elements, check if there exists a pair(i,j) such that arr[i] + arr[j] == k and i != j
// NOTE: i and j are index value, k is given sum.
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 7, 5};
        int k = 8;
        boolean result = twoSum(arr, k);
        System.out.println(result);
    }

    public static boolean twoSum(int[] arr, int k) {
        int n = arr.length;
        boolean result = false;
        for (int i = 0; i <= n - 2; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[i] + arr[j] == k) {
                    result = true;
                }
            }
        }
        return result;
    }
}
