package part_2;

public class RemoveSpecialCharacterUsingMethod {
    public static void main(String[] args) {
        String s = "@#_)($(!@$)( My name is AJay";
        s = s.replaceAll("[a-zA-Z0-9]", "");
        System.out.println(s);
    }
}
