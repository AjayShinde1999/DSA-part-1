package Levelup_Arrays_1;

public class ProductOfAllExceptI {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        productOfAllExceptI(arr);
    }

    // TC : O(N^2)
//    public static void productOfAllExceptI(int[] arr) {
//        int n = arr.length;
//
//        for (int i = 0; i < n; i++) {
//            int p = 1;
//            for (int j = 0; j < n; j++) {
//                if (i != j) {
//                    p = p * arr[j];
//                }
//            }
//            System.out.println(p);
//        }
//    }

    public static void productOfAllExceptI(int[] arr) {
        int n = arr.length;
        int[] prdSum = new int[n];

        prdSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prdSum[i] = prdSum[i - 1] * arr[i];
        }

        int suffix = 1;
        for(int i=n-1; i>0; i--){
            prdSum[i] = prdSum[i-1] * suffix;
            suffix = suffix * arr[i];
        }
        prdSum[0] = suffix;

        for(int i : prdSum){
            System.out.print(i+" ");
        }
    }
}
