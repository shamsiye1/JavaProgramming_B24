package day61_collections;

import java.util.ArrayDeque;

public class QueueExample2 {
    public static void main(String[] args) {

        ArrayDeque<String> obj = new ArrayDeque<>();
        obj.offer("z");
        obj.offer("hello");
        obj.offer("turkey");
        obj.offer("East Turkistan");
        System.out.println(obj);

        System.out.println(obj.peek());
        System.out.println(obj.poll());
        System.out.println(obj);

        System.out.println(obj.peek());
        System.out.println(obj.poll());
        System.out.println(obj);

        //    obj.offer(null);  cannot store null element in queues

        obj.addFirst("birds");
        System.out.println(obj);


    }
}
