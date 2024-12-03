package Levelup_Arrays_1;

public class PivotIndexOrEquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {-2, 6, 3, 4};
        System.out.println(pivotIndex(arr));
    }

    public static int pivotIndex(int[] arr) {
        int[] pf = prefixSum(arr);
        int n = arr.length;

        int ans = 0;
        // let's skip for 1st and last index
        for (int i = 1; i < n - 1; i++) {
            int leftSum = pf[i - 1];
            // sum(arr[i+1], n-1)
            int rightSum = pf[n - 1] - pf[i + 1 - 1];

            if (leftSum == rightSum) {
                ans++;
            }
        }
        // 0th index
        if (0 == pf[n - 1] - pf[0]) {
            ans++;
        }

        // last index
        if (pf[n - 2] == 0) {
            ans++;
        }
        return ans;
    }

    public static int[] prefixSum(int[] arr) {

        int[] pf = new int[arr.length];
        pf[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            pf[i] = pf[i - 1] + arr[i];
        }

        return pf;
    }
}
