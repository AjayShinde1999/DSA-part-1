package part_3;

public class CountNumberOfEvenOddDigitsInNumber {
    public static void main(String[] args) {
        int num = 145678;
        int evenCount = 0;
        int oddCount = 0;

        while (num > 0) {
            int r = num % 10;
            if (r % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            num = num / 10;
        }

        System.out.println("Even : " + evenCount);
        System.out.println("Odd : " + oddCount);
    }
}
