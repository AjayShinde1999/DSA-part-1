package algoprep_video_9;

import java.util.Scanner;

public class SquareRootOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num = sc.nextInt();
        int ans = 1;
        for (int i = 1; i * i <= num; i++) {
            ans = i;
        }

        System.out.println(ans);

//        using while loop
//        int i = 1;
//        int ans = 1;
//        while (i * i <= num) {
//            ans = i;
//            i++;
//        }
//        System.out.println(ans);
    }
}
