package part_5;

public class PrintDuplicateNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6};
        printDuplicate(arr);
    }

    public static void printDuplicate(int[] arr) {
        int n = arr.length;
        int k = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                if (i == 1 || arr[i] != arr[i - 2]) {
                    arr[k] = arr[i];
                    k++;
                }
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
