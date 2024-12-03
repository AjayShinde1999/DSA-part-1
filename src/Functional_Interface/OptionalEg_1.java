package Functional_Interface;

import java.util.Optional;

public class OptionalEg_1 {
    public static void main(String[] args) {
        Optional<Object> o = Optional.ofNullable(null);

        if (o.isPresent()) {
            System.out.println("Hello");
        } else {
            System.out.println("Its Null");
        }

        Optional<String> optional = Optional.ofNullable(null);
        optional.ifPresent(value-> System.out.println(value)); // value is present it will print.

        Optional<Object> opt = Optional.ofNullable("AJAY");
        Object defaultValue = opt.orElse("Default Value");
        System.out.println(defaultValue);

        Optional<Object> opt1 = Optional.of(null);// it should be not null, or else we will null pointer exception.
        opt1.ifPresent(value1-> System.out.println(value1));
    }
}
