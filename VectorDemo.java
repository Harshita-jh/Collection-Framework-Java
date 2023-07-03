package collectionframe;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        //left side we have to mention generic its mendatory right side is optional
        Vector<String> vector = new Vector<String>();
        vector.add("5");
        vector.add("10");
        vector.add("15");
        System.out.println(vector);
        vector.clear();
        System.out.println(vector);
    }
}
