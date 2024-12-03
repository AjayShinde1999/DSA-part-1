package algoprep_video_12;

import java.util.Scanner;

public class PrintMatrixColumnWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thr row size");
        int n = sc.nextInt();
        System.out.println("Enter the column size");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Enter the elements");
                arr[i][j] = sc.nextInt();
            }
        }
        printMatrixColumnWise(arr, n, m);

    }

    public static void printMatrixColumnWise(int[][] arr, int n, int m) {

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
