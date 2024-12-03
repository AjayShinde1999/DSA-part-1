package part_2;

import java.util.LinkedHashMap;

public class CountRepeatedCharacter {
    public static void main(String[] args) {
        String str = "aaannnbcbcbdudee";
        char[] charArray = str.toCharArray();

        LinkedHashMap<Character, Integer> result = new LinkedHashMap<>();

        for (char c : charArray) {
            if (result.containsKey(c)) {
                result.put(c, result.get(c) + 1);
            } else {
                result.put(c, 1);
            }
        }

        result.entrySet().stream().forEach(n -> System.out.println(n.getKey() + " : " + n.getValue()));

    }
}
