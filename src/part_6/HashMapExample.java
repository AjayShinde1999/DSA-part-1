package part_6;

import java.util.HashMap;

public class HashMapExample extends Thread {
    static HashMap<Integer, String> hashMap = new HashMap<>();

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        hashMap.put(5, "E");
    }

    public static void main(String[] args) throws InterruptedException {

        hashMap.put(1, "A");
        hashMap.put(2, "B");
        hashMap.put(3, "C");
        hashMap.put(4, "D");
        HashMapExample h = new HashMapExample();
        h.start();

        for (Object o : hashMap.entrySet()) {
            Object s = o;
            System.out.println(s);
            Thread.sleep(1000);
        }
        System.out.println(hashMap);


    }
}
