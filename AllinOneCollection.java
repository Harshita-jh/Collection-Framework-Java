
//import util package[it has all collection classes]
import java.util.*;

public class AllinOneCollection {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Collection Framework...");

        /*
         * creating collection
         * 
         * 1) Type safe collection-same type of elements or obejects are added
         * 
         * 2) non type safe collection-different types of elements can be added
         * 
         */

        // Type safe collection(Generic way of creating collection because here we have
        // specify String type)
        ArrayList<String> name = new ArrayList<>();
        name.add("Harshita");
        name.add("Harshita");
        name.add("Harshita");
        name.add("abc");
        // because we have specify string type
        // name.add(123);
        name.add("123");
        System.out.println(name);
        // System.out.println(name.get(1));

        // non type safe collection
        // LinkedList list = new LinkedList();
        // list.add("Harshita");
        // list.add(123);
        // list.add(12.0033);
        // list.add(true);
        // System.out.println(list);
        System.out.println("Size = "+name.size());
        name.remove(1);
        System.out.println(name);
        System.out.println("Size = "+name.size());
        //check if item is available
        System.out.println(name.contains("Harshita"));
        //check if collection is empty 
        System.out.println(name.isEmpty());
        //setting value
        name.set(1, "Ram");
        System.out.println(name);

        //Vector
        Vector<String> vector = new Vector<>();
        //added all ArrayList element(name)
        vector.addAll(name);
        System.out.println("Vector = "+vector);
        System.out.println("---------------------------------------");

        //HashSet
        HashSet<Double> nms = new HashSet<>();
        nms.add(14.12);
        nms.add(123.321);
        nms.add(2345.5678);
        nms.add(66.77);
        //duplicates not allowed
        nms.add(66.77);
        System.out.println(nms);

        TreeSet<Double> tset = new TreeSet<>();
        //added all HashSet element(nms)
        tset.addAll(nms);
        System.out.println(tset);
        
    }
}