package collectionframe;

import java.util.LinkedList;
import java.util.Queue;

/**
 * QueueDemo
 */
public class QueueDemo {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        //compare add(Linked list method) and offer(similar to add only but this is queue method)
        queue.add(10);
        queue.offer(20);
        queue.offer(15);
        queue.add(50);
        System.out.println("Queue =" +queue);
        System.out.println("Q remove ="+queue.remove());
        System.out.println("Queue =" +queue);
        System.out.println("Q poll ="+queue.poll());
        System.out.println("Queue =" +queue);
        System.out.println("Q peek = "+queue.peek());
    }
}