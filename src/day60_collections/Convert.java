package day60_collections;

import java.util.*;

public class Convert {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4, 55, 2, 8, 7, 4, 6, 55, 2, 1, 5, 9));

        // remove all duplicate values

        Set<Integer> unique = new HashSet<>(nums); // Set is interface so no object, so we use hasSet
        System.out.println(unique); // Set property do not include duplicate

        Set<String> obj = new HashSet<>();
        obj.add(null);
        obj.add("hello");
        obj.add("$4.0");
        obj.add("%");
        System.out.println("Original: " + obj); // unordered
        System.out.println("New: "+ new ArrayList<>(obj)); // Set convert to ArrayList

        List<String> newList = new ArrayList<>(obj);
        newList.add("hello");
        newList.get(0);
        System.out.println("New ArrayList: "+ newList);


        System.out.println("New Set: "+ new HashSet<>(newList));



    }
}
