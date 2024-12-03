package java_8;

import java.util.HashMap;

public class HashMapItr {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("AJAY", 24);
        map.put("Rahul", 22);

//        map.entrySet().stream().forEach(n -> System.out.println(n.getKey() + " : " + n.getValue()));
        map.forEach((name, age) -> System.out.println(name + ":" + age));

    }
}
