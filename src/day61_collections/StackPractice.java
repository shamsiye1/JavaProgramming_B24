package day61_collections;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>(); // LIFO ==> last in first out

        stack.push("a");  // push method help us to know the stack idea
        stack.push("b");
        stack.push("c"); // at the top
        System.out.println(stack);
        System.out.println("At the top of my stack: "+ stack.peek());

        stack.push("joe");
        stack.push("nadiye");// at the top
        System.out.println(stack);
        System.out.println("At the top of my stack: "+ stack.peek()); // peek method print first element

        stack.pop(); // remove the element peek element (actually that element ordered on last, but stack is last in first out)
        System.out.println(stack);
        System.out.println("At the top of my stack: "+ stack.peek());
        stack.pop();
        System.out.println(stack);












    }
}
