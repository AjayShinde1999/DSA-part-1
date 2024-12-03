package algoprep_video_13;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Ajay Shinde";
        reverseString(str);
    }

    public static void reverseString(String str) {
        int n = str.length();
        char[] ch = str.toCharArray();

        int sp = 0;
        int ep = n - 1;

        while (sp < ep) {
            char temp = ch[sp];
            ch[sp] = ch[ep];
            ch[ep] = temp;
            sp++;
            ep--;
        }

        String temp = "";
        String ans = temp.valueOf(ch);
        System.out.println(ans);
    }
}
