package part_3;

import java.util.Random;

public class GenerateRandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int value = rand.nextInt(1000); // between 0 t0 999
        System.out.println(value);

    }
}
