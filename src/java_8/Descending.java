package java_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Descending {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 6, 8, 32, 0);
        List<Integer> desc = numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(desc);

        for (Integer i : desc) {
            System.out.println(i);
        }
    }
}
