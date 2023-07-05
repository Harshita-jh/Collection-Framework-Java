package collectionframe;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> llset = new LinkedHashSet<Integer>();
        llset.add(5);
        llset.add(2);
        llset.add(2);
        llset.add(10);
        llset.add(12);
        System.out.println(llset);
        boolean b = llset.contains(2);
        System.out.println("2 is present or not = " +b);
    }
}
