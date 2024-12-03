package dsa_found_function;

import java.util.Scanner;

public class NPR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Enter the value of r");
        int r = sc.nextInt();
        int nfact = fact(n);
        int nmrfact = fact(n - r);
        int ans = nfact / nmrfact;
        System.out.println(ans);
    }

    public static int fact(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }
        return ans;
    }
}
