package dsa_found_problem_solving_intro;

import java.util.Scanner;

public class OptimizeCheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        checkPrime(n);
    }

    public static void checkPrime(int n) {
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
        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
    }
}
