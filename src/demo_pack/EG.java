package demo_pack;

public class EG {
    static int num1 = 10;
    int num2 = 100;

    public static void main(String[] args) {
       num1 = 2;
       EG e = new EG();
       e.num2 = 200;

        System.out.println(num1);
        System.out.println(e.num2);

        EG e1 = new EG();
        System.out.println(e1.num2);
    }
}
