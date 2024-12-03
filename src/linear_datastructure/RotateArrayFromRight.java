package linear_datastructure;

public class RotateArrayFromRight {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 2;
        k = k % n;
        rotate(arr, 0, n - 1);
        rotate(arr, 0, k - 1);
        rotate(arr, k, n - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void rotate(int[] arr, int s, int e) {
        int sp = s;
        int ep = e;

        while (sp < ep) {
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }
    }
}
