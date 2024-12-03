package java_8;

import java.util.HashMap;

public class IteratingMap_2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Ajay");
        hashMap.put(2, "ajit");
        hashMap.put(3, "manju");
        hashMap.put(4, "prakash");

        hashMap.entrySet().stream().filter(entry -> entry.getKey() % 2 == 0).forEach(entry -> hashMap.put(entry.getKey(), entry.getValue().toUpperCase()));

        hashMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
