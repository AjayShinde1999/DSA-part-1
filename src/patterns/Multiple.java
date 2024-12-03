package patterns;

class InsufficientFunds extends RuntimeException {

    public InsufficientFunds(String message) {
        super(message);
    }
}

public class Multiple {
    public static void main(String[] args) {
        int amount = 100000;
        int balance = 20000;

        if (amount <= balance) {
            System.out.println("Collect the amount");
        } else {
            throw new InsufficientFunds("In-sufficient Funds");
        }
    }
}