package part_2;

public class RemoveSpecialCharacter {
    public static void main(String[] args) {
        String str = "@#@#@#&*(Ajay)(*) 123";
        removeSpecial(str);
    }

    public static void removeSpecial(String str) {
        char[] ch = str.toCharArray();
        int n = ch.length;
        String s = "";
        for (int i = 0; i < n; i++) {
            char c = ch[i];
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                s = s + c;
            }
        }

        System.out.println(s);
    }
}
