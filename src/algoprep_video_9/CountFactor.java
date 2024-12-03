package algoprep_video_9;

import java.util.Scanner;

public class CountFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(countFactor(n));
    }

    static int countFactor(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i != n / i) {
                    count = count + 2;
                } else {
                    count = count + 1;
                }
            }
        }
        return count;
    }
}
