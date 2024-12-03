package part_4;

public class CountOccurrenceOfParticularCharacter {
    public static void main(String[] args) {
        String s = "my name is ajay";

        int countAfterRemove = s.replace("a", "").length();
        int totalLength = s.length();
        int count = totalLength - countAfterRemove;
        System.out.println(count);

    }
}
