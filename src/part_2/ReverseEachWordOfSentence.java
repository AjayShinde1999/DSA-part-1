package part_2;

public class ReverseEachWordOfSentence {
    public static void main(String[] args) {
        String str = "my name is ajay shinde";
        String[] words = str.split(" ");

        for (String word : words) {
            String s = reverseWords(word);
            System.out.print(s+" ");
        }
    }

    static String reverseWords(String word) {
        StringBuilder builder = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            builder.append(word.charAt(i));
        }
        return builder.toString();
    }
}
