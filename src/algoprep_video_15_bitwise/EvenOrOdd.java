package algoprep_video_15_bitwise;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        checkEvenOrOdd(num);
    }

    public static void checkEvenOrOdd(int num) {

        if ((num & 1) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
