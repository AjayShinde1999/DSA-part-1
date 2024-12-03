package part_4;

import java.util.HashSet;

public class FindDuplicateElementInArray {
    public static void main(String[] args) {
        String[] x = {"java", "C", "C++", "java"};

        boolean result = false;
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] == x[j]) {
                    result = true;
                }
            }
        }

        if (result == true) {
            System.out.println("Duplicate Found");
        } else {
            System.out.println("Duplicate Not Found");
        }

        // Using HashSet
        String[] arr = {"java", "C", "C++", "java"};
        HashSet<String> h = new HashSet<>();
        boolean result1 = false;
        for (String s : arr) {
            if (h.add(s) == false) {
                System.out.println("Duplicate Found");
                result1 = true;
            }
        }
        if (result1 == false) {
            System.out.println("Duplicate Not Found");
        }
    }
}
