package part_3;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Ajay";
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println(rev);

        // using StringBuffer
        StringBuffer sb = new StringBuffer("Shinde");
        StringBuffer reverse = sb.reverse();
        System.out.println(reverse);
    }
}
