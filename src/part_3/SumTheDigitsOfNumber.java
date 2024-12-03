package part_3;

public class SumTheDigitsOfNumber {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;

        while (num > 0) {
            int r = num % 10;
            sum = sum + r;
            num = num / 10;
        }

        System.out.println(sum);
    }
}
