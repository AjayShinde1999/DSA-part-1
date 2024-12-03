package part_2;

import java.util.LinkedHashSet;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String intro = "my name is is ajay";
        String[] s = intro.split("\\s+"); // split the string at every sequence of one or more whitespace characters

        LinkedHashSet<String> l = new LinkedHashSet<>();
        for (int i = 0; i < s.length; i++) {
            l.add(s[i]);
        }

        l.forEach(n -> System.out.print(n + " "));
    }
}
