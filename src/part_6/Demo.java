package part_6;

class InsufficientFunds extends RuntimeException {

    public InsufficientFunds(String message) {
        super(message);
    }
}

public class Demo {
    public static void main(String[] args) {
        int amount = 11000;
        int balance = 10000;

        if (amount <= balance) {
            System.out.println("Collect your amount");
        } else {
            throw new InsufficientFunds("No sufficient fund to withdraw");
        }
    }
}
