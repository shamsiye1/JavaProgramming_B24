package day62_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClasses {
    public static void main(String[] args) {

        // HashMap didn't care order
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(2,"two");
        map1.put(4,"four");
        map1.put(1,"one");
        map1.put(5,"five");
        map1.put(3,"three");
        System.out.println("HashMap: "+map1);

        // linkedHashMap can keep the order that what you put enter before
        Map<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(2,"two");
        map2.put(4,"four");
        map2.put(1,"one");
        map2.put(5,"five");
        map2.put(3,"three");
        System.out.println("LinkedHashMap: "+map2);

       // TreeMap guaranteed the ascending order
        Map<Integer, String> map3 = new TreeMap<>();
        map3.put(2,"two");
        map3.put(4,"four");
        map3.put(1,"one");
        map3.put(5,"five");
        map3.put(3,"three");
        System.out.println("Tree Map: "+map3);

        Map<String, String> map4 = new HashMap<>();
        map4.put("apple", "juice");
        map4.put("water","pool");
        map4.put("computer","chip");
        map4.put("Zilnaz", "Muradel");
        map4.put("Class","java");

        System.out.println("HashMap order: "+map4);


        Map<String, String> map5 = new LinkedHashMap<>();
        map5.put("apple", "juice");
        map5.put("water","pool");
        map5.put("computer","chip");
        map5.put("Zilnaz", "Muradel");
        map5.put("Class","java");

        System.out.println("LinkedMap order: "+map5);


        Map<String, String> map6 = new TreeMap<>();
        map6.put("apple", "juice");
        map6.put("water","pool");
        map6.put("computer","chip");
        map6.put("Zilnaz", "Muradel");
        map6.put("Class","java");

        System.out.println("TreeMap order: "+map6);

    }
}
