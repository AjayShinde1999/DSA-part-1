package part_4;

public class CountWordsInStringWithoutSplitMethod {
    public static void main(String[] args) {
        String name = "my name is ajay shinde";
        int count = 1;
        for (int i = 0; i < name.length() - 1; i++) {
            if ((name.charAt(i) == ' ') && (name.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        System.out.println(count);
    }
}
