package dsa_found_patterns;

import java.util.Scanner;

//N=5
//  1
// 232
//34543
// 232
//  1
public class Pattern_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int nspc = n / 2;
        int nstr = 1;
        int count = 1;

        for (int i = 1; i <=n; i++) {
            for (int j = 0; j < nspc; j++) {
                System.out.print(" ");
            }

            if (i <= n / 2 + 1) {
                count = i;
            } else {
                count = n - i + 1;
            }

            for (int k = 0; k < nstr; k++) {
                System.out.print(count);

                if (k < nstr / 2) {
                    count++;
                } else {
                    count--;
                }
            }

            if (i <= n / 2) {
                nspc--;
                nstr = nstr + 2;
            } else {
                nspc++;
                nstr = nstr - 2;
            }
            System.out.println();
        }

    }
}
