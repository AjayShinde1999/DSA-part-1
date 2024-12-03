package part_1;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 370;
        int result = 0;
        int armstrong = num;
        while (num > 0) {
            int r = num % 10;
            result = (r * r * r) + result;
            num = num / 10;
        }

        if (armstrong == result) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
