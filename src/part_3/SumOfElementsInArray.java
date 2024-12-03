package part_3;

public class SumOfElementsInArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);

        // using forEach loop
        int[] arr1 = {2, 3, 4, 5, 6};
        int sum1 = 0;
        for (int i : arr1) {
            sum1 = sum1 + i;
        }
        System.out.println(sum1);
    }
}
