package java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsFromTwoLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 2, 0, 10);
        List<Integer> list2 = Arrays.asList(11, 10, 2, 4, 1);

        List<Integer> commonElements = list1.stream().filter(e -> list2.contains(e)).collect(Collectors.toList());

        System.out.println(commonElements);
    }
}
