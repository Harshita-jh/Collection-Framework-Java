package collectionframe;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Second", 20);
        map.put("First", 10);
        System.out.println("HashMap = "+map);
    }
}
