package part_3;

public class PrintLargestOfThreeNumber {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 100;
        int num3 = 50;

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }

        // using ternary operator
        int a = 10;
        int b = 100;
        int c = 50;

        int largest = a > b ? a : b;
        largest = c > largest ? c : largest;
        System.out.println(largest);

    }
}
