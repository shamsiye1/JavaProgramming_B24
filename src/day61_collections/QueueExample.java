package day61_collections;

import java.util.PriorityQueue;

public class QueueExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(2);
        queue.add(5);
        queue.add(7);
        queue.add(9);
        queue.add(6);
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.poll()); // remove method
        System.out.println(queue);

        // this example just talk about the difference between poll method and remove method
//        System.out.println(new PriorityQueue<>().remove());  ==> cause exception
        System.out.println(new PriorityQueue<>().poll()); // returns null



    }
}
