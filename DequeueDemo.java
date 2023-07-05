package collectionframe;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueDemo {
    public static void main(String[] args) {
        Deque<Integer> adq = new ArrayDeque<Integer>();
        adq.offer(10);
        adq.offer(20);
        adq.offerLast(30);
        //adq.poll();
        adq.pollFirst();
        adq.pollLast();
        adq.offerFirst(40);
        System.out.println("Deque = "+adq);
        
    }
}
