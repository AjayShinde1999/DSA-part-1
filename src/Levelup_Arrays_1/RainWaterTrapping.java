package Levelup_Arrays_1;

public class RainWaterTrapping {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 2, 1, 2, 4, 3, 2, 1, 3, 1};
        System.out.println(sum(arr));
    }

    public static int sum(int[] arr) {

        int[] prfMax = prfMax(arr);
        int[] sufMax = sufMax(arr);

        int total = 0;
        int n = arr.length;
        for (int i = 1; i < n - 1; i++) {
            int lb = prfMax[i - 1];
            int rb = sufMax[i + 1];
            int yb = Math.min(lb, rb);
            int contri = yb - arr[i];

            if (contri > 0) {
                total = total + contri;
            }
        }
        return total;
    }

    private static int[] prfMax(int[] arr) {
        int n = arr.length;
        int[] prfMax = new int[n];
        prfMax[0] = arr[0];

        for (int i = 1; i < n; i++) {
            int max = Math.max(prfMax[i - 1], arr[i]);
            prfMax[i] = max;
        }
        return prfMax;
    }

    private static int[] sufMax(int[] arr) {
        int n = arr.length;
        int[] sufMax = new int[n];
        sufMax[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            int max = Math.max(sufMax[i + 1], arr[i]);
            sufMax[i] = max;
        }
        return sufMax;
    }
}
