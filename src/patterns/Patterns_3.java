package patterns;

import java.util.Scanner;

public class Patterns_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int nums = 1;
        int count = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nums; j++) {
                System.out.print(count+" ");
                count++;
            }
            nums++;
            System.out.println();
        }
    }
}
