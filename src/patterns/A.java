package patterns;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class HelloWorld {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);

        // Print original map
        System.out.println("Original map: " + map);
//
//        HashMap<String, Integer> filteredMap = map.entrySet()
//                .stream().filter(entry -> entry.getValue() % 2 == 0)
//                .collect(Collectors.toMap( Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, HashMap::new));
//        System.out.println("Filtered map with even values: " + filteredMap);


        HashMap<String, Integer> filteredMap = map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() % 2 == 0) // Lambda expression for filtering
                .collect(Collectors.toMap(
                        entry -> entry.getKey(),    // Lambda expression for key mapping
                        entry -> entry.getValue(),  // Lambda expression for value mapping
                        (oldValue, newValue) -> oldValue,  // Lambda expression for merge function
                        HashMap::new          // Constructor reference for new HashMap
                ));

        System.out.println("Filtered map with even values: " + filteredMap);

    }
}











