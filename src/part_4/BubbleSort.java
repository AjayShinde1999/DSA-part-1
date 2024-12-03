package part_4;

public class BubbleSort {
    public static void main(String[] args) {
        int[] x = {2, 1, 0, 5, 4, 3}; // 6
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
            System.out.println(i);
        }
    }
}
