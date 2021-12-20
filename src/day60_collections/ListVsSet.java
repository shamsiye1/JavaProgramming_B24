package day60_collections;

import java.util.ArrayList;
import java.util.HashSet;

public class ListVsSet {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("nadiye");
        list.add("zilnaz");
        list.add("nazakat");
        list.add("shamsiye");
        list.add("shamsiye");
        list.add(null);
        System.out.println(list);

        HashSet<String> set = new HashSet<>();
        set.add("c");
        set.add("c");
        set.add("a");
        set.add("b");
        set.add("5");
        set.add("3");
        set.add("d");
        set.add(null);
        set.add(null);
        System.out.println(set);

        for (String each : set) {
            System.out.println(each);
        }
        // this is constructor
        HashSet set2 = new HashSet<>(list); // converts the list to set

        System.out.println(list);
        System.out.println(set2);


    }
}
