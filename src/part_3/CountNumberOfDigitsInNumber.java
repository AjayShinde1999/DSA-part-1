package part_3;

public class CountNumberOfDigitsInNumber {
    public static void main(String[] args) {
        int num = 98087676;
        int count = 0;

        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }
}
