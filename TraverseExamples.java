import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TraverseExamples {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Harshita");
        name.add("xyz");
        name.add("Rohan");
        name.add("abc");

        //Foreach loop
        for(String str : name){
            //System.out.println(str);
            System.out.println(str +"\t"+str.length()+"\t");
            StringBuffer br = new StringBuffer(str);
            System.out.println(br.reverse());
        }
        System.out.println("-------------------------------------");

        //Traversing using Iterator:Forward traversing
        java.util.Iterator<String> itr = name.iterator();
        while(itr.hasNext()){
            String next = itr.next();
            System.out.println(next);
        }

        //Backward traversing of collection ListIterator
        ListIterator<String> litr = name.listIterator(name.size());
        while(litr.hasPrevious()){
            String previous = itr.previous();
            System.out.println(previous);
        }

        //Enumeration

        System.out.println("---------------foreach()----------------------");
        //ForEach() method
        name.forEach()(e ->{
            System.out.println(e);
        });

        //TreeSet
        System.out.println("Sorting Elements");
        TreeSet<String> set = new TreeSet<>();
        set.addAll(name);
        set.forEach(e->{
            System.out.println(e);
        });

        
    }
}
