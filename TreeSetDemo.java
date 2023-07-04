package collectionframe;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> tset = new TreeSet<Integer>();
        tset.add(20);
        tset.add(5);
        tset.add(10);
        tset.add(12);
        tset.add(6);
        tset.add(6);
        System.out.println(tset);
    }
}
