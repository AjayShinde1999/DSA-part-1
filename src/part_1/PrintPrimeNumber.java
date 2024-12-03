package part_1;

import java.util.ArrayList;

public class PrintPrimeNumber {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 30;
        ArrayList<Integer> a = new ArrayList<>();
        for (int n = num1; n <= num2; n++) {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                a.add(n);
            }
        }
        System.out.println(a);
    }
}
