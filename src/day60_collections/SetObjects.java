package day60_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetObjects {

    public static void main(String[] args) {

        Set<String> obj = new HashSet<>();
        obj.add(null);
        obj.add("hello");
        obj.add("$4.0");
        obj.add("%");
        obj.add("100");

        Set<String> obj1 = new LinkedHashSet<>();
        obj1.add(null);
        obj1.add("hello");
        obj1.add("$4.0");
        obj1.add("%");
        obj1.add("100");
        obj1.add("hello");
        obj1.add("%&");



        Set<String> obj2 = new TreeSet<>(); // TreeSet can sort and cannot accept null because it cannot sort null, Cannot  duplicate
      //  obj2.add(null);  TreeSet canot
        obj2.add("hello");
        obj2.add("$4.0");
        obj2.add("%");
        obj2.add("100");
        obj2.add("hello");
        obj2.add("%&");


        System.out.println("HasSet: "+obj);
        System.out.println("LinkedHashSet: obj1 "+obj1);
        System.out.println("TreeSet: "+obj2);







    }

}
