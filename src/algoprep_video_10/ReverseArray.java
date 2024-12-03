package algoprep_video_10;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the elements");
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Reverse ");
        for (int x : arr) {
            System.out.println(x);
        }
        reverse(arr);
    }

    public static void reverse(int[] arr) {
        int sp = 0;
        int ep = arr.length - 1;

        while (sp < ep) {
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }

        System.out.println("After Reverse ");
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
