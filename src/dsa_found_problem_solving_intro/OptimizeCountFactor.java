package dsa_found_problem_solving_intro;

import java.util.Scanner;

public class OptimizeCountFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int count = countFactor(n);
        System.out.println(count);
    }

    public static int countFactor(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i != n / i) {
                    count = count + 2;
//                    System.out.println(i);
//                    System.out.println(n / i);
                } else {
                    count = count + 1;
//                    System.out.println(i);
                }
            }
        }
        return count;
    }
}
