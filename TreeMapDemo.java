package collectionframe;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Integer> tmap = new TreeMap<>();
        tmap.put("Second", 20);
        tmap.put("First", 10);
        System.out.println("TreeMap = "+tmap);
        System.out.println(tmap.get("First"));
        System.out.println(tmap.keySet());
        System.out.println(tmap.values());
    }
}
