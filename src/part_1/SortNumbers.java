package part_1;

public class SortNumbers {
    public static void main(String[] args) {
        int[] x = {7, 23, 12, 43, 1, 0, 78};
        int temp;

        for (int j = 0; j < x.length - 1; j++) {
            for (int i = 0; i < x.length - 1; i++) {
                if (x[i] > x[i + 1]) {
                    temp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = temp;
                }
            }
        }
        for (int i : x) {
            System.out.print(i + " ");
        }
    }
}
