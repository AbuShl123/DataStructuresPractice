package myProject.DT.practices.stack_practice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackBasic {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("first");
        stack.push("second");
        stack.push("third");

        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.size());

        System.out.println("--------------------------------------");

        Deque<String> queue = new ArrayDeque<>();
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);

        System.out.println("--------------------------------------");

        Stack<Integer> realStack = new Stack<>();
        realStack.push(1);
        realStack.push(2);
        realStack.push(3);
        System.out.println(realStack);
        System.out.println(realStack.pop());
        System.out.println(realStack);
    }
}
