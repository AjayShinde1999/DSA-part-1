package algoprep_video_10;

import java.util.Scanner;

public class SwapIndexesInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = sc.nextInt();
        int[] arr = new int[size];


        for (int i = 0; i < size; i++) {
            System.out.println("Enter the values");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter 1st index");
        int idx1 = sc.nextInt();
        System.out.println("Enter 2nd index");
        int idx2 = sc.nextInt();

        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;

        for (int x : arr) {
            System.out.println(x);
        }
    }
}
