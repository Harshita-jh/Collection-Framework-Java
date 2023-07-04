package collectionframe;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        //LIFO (Last in first out)
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(10);
        stack.push(20);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack.peek());
        
    }
}
