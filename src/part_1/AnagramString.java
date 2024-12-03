package part_1;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        System.out.println(anagramString("Listen","Silent"));
    }

    public static boolean anagramString(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] arr1 = s1.toLowerCase().toCharArray();
        char[] arr2 = s2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
