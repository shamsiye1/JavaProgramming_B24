package day60_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListObjects {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("nadiye");
        list.add("zilnaz");
        list.add("nazakat");
        list.add("shamsiye");
        list.add("shamsiye");
        list.add(null);
        System.out.println(list);
        System.out.println(list.get(2));

        List<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("c");
        linked.add(null);
        System.out.println(linked);
        System.out.println(linked.get(2));
        System.out.println(linked.get(4));

        ((LinkedList) linked).addFirst("hello");
        ((LinkedList) linked).addLast("bye");

        System.out.println(linked);

        List<String> vector = new Vector<>();
        vector.add("a");
        vector.add("b");
        vector.add("c");
        vector.add("c");
        vector.add(null);
        System.out.println(vector);





    }

}
