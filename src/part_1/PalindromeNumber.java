package part_1;

public class PalindromeNumber {
    public static void main(String[] args) {
       int num = 1221;
        int rev = 0;
        int originalNumber = num;

        while (num > 0) {
            int r = num % 10;
            rev = rev * 10 + r;
            num = num / 10;
        }

        if (originalNumber == rev) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome NUmber");
        }
    }
}
