package part_1;

public class SecondMinNumber {
    public static void main(String[] args) {
        int[] x = {1, 4, 3, 5, 67, 2, 9};
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
        System.out.println(x[1]);

    }
}
