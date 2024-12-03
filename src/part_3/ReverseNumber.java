package part_3;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1234;
        int reversedNumber = 0;

        while (num > 0) {
            int r = num % 10;
            reversedNumber = reversedNumber * 10 + r;
            num = num / 10;
        }
        System.out.println(reversedNumber);

        //using StringBuffer
        int num1 = 2345;
        StringBuffer sb = new StringBuffer(String.valueOf(num1));
        StringBuffer reverse = sb.reverse();
        System.out.println(reverse);

        int num2 = 3456;
        StringBuffer sb1 = new StringBuffer();
        sb1.append(num2);
        StringBuffer reverse1 = sb1.reverse();
        System.out.println(reverse1);
    }
}
