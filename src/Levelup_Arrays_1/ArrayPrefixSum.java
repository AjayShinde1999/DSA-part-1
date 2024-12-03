package Levelup_Arrays_1;

public class ArrayPrefixSum {
    public static void main(String[] args) {
        int[] arr = {4, 1, 6, -2, 7};
        int[] result = prefixSum(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    // T.C = O(N^2) and S.C = O(1) (Input and Output not considered in sc)
//    public static int[] prefixSum(int[] arr) {
//        int n = arr.length;
//        int[] prefixSum = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            int sum = 0;
//            for (int j = 0; j <= i; j++) {
//                sum = sum + arr[j];
//            }
//            prefixSum[i] = sum;
//        }
//        return prefixSum;
//    }

    // T.C = O(N) and S.C = O(1)
    public static int[] prefixSum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }
}
