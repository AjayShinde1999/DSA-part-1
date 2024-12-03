package patterns;

import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int nstr = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= nstr; j++) {
                System.out.print("* ");
            }
            nstr++;
            System.out.println();
        }
    }
}
