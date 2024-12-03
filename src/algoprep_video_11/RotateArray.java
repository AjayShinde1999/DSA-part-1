package algoprep_video_11;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 3, 21, 8};
        int k = 3; // rotate 3 times
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void reverse(int[] arr, int sp, int ep) {

        while (sp < ep) {
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }

    }
}
