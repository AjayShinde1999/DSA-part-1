package part_2;

public class RemoveSpecialCharsFromString {
    public static void main(String[] args) {
        String s = "$$%$#@ my name is ajay #@!(*";
        String spl = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 65 && c <= 90) {

            } else if (c >= 97 && c <= 122) {

            } else if (c >= 48 && c <= 57) {

            } else {
                spl = spl + c;
            }
        }
        System.out.println(spl);

    }
}
