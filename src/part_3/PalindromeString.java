package part_3;

public class PalindromeString {
    public static void main(String[] args) {
        String name = "MADAM";
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }

        if (name.equals(rev)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not Palindrome String");
        }
    }
}
