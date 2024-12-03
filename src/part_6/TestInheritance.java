package part_6;

import java.util.function.Predicate;

public class TestInheritance {
    public static void main(String[] args) {
        Predicate<Integer> p = (Integer num) -> num % 2 == 0;

        boolean test = p.test(100);
        System.out.println(test);
    }
}
