package collectionframe;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(0, 20);
        linkedList.add(10);
        linkedList.add(1, 15);
        //in remove always give 
        linkedList.remove(1);
        System.out.println(linkedList);
    }
}
