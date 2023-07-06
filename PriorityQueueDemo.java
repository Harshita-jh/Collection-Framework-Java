package collectionframe;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        //default first element will be minimum value
        //  PriorityQueue<Integer> pq = new PriorityQueue<>();
        //  pq.offer(12);
        //  pq.add(3);
        //  pq.add(4);
        //  pq.offer(2);
        //  System.out.println("PriorityQueue = "+pq);
        //  System.out.println("PriorityQueue = "+pq.peek());

        // but using Comparator.reverseOrder() first element will be largest value
         PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
         pq.offer(12);
         pq.add(3);
         pq.add(4);
         pq.offer(2);
         System.out.println("PriorityQueue = "+pq);
         System.out.println("PriorityQueue = "+pq.peek());
    }
}
