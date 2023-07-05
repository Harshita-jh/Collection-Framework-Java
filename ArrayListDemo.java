package collectionframe;

import java.util.ArrayList;

/**
 * ListDemo
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        //ArrayList
        // List list = new ArrayList();
        //     list.add(10);
        //     list.add(20);
        //     list.add(30);
        //     list.add("Harshita");
        //     System.out.println(list);
        
        //using wrapper class and generics<>
        ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(10);
            list.add(20);
            list.add(2, 25);
            list.add(30);
            //list.add("Harshita");
            System.out.println(list);
        
    }
}