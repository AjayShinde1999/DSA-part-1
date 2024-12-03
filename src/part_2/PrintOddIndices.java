package part_2;

public class PrintOddIndices {
    public static void main(String[] args) {
        String name = "Ajay Shinde";

        for (int i = 1; i < name.length(); i = i + 2) {
            System.out.print(name.charAt(i));
        }
    }
}
