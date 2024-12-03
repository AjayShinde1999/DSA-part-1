package part_5;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        int length = arr1.length + arr2.length;
        int[] merge = new int[length];

        int temp = 0;
        for (int i : arr1) {
            merge[temp] = i;
            temp++;
        }

        for (int i : arr2) {
            merge[temp] = i;
            temp++;
        }

        for (int i : merge) {
            System.out.print(i + " ");
        }
    }
}
