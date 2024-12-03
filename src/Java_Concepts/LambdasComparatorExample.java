package Java_Concepts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdasComparatorExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ajay", "Shinde", "Bob", "Rohan");

        Comparator<String> byLength = (a, b) -> {
            System.out.println("Sorting");
            return Integer.compare(a.length(), b.length());
        };

        list.sort(byLength);
        System.out.println(list);

//        Comparator<String> s = (a, b) -> a.compareTo(b);

        list.sort((a, b) -> a.compareTo(b));
        System.out.println(list);
    }
}
