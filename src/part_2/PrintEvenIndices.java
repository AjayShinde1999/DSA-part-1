package part_2;

public class PrintEvenIndices {
    public static void main(String[] args) {
        String name = "Ajay Shinde"; //Aa hne

        for (int i = 0; i < name.length(); i = i + 2) {
            System.out.print(name.charAt(i));
        }
    }
}
