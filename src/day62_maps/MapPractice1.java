package day62_maps;

import java.util.HashMap;

public class MapPractice1 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        //        key  ,  value
        //map.add();  maps don't have add method, because they don;t inherit collection interface

        map.put(5,"hello");
        map.put(2,"syede");
        map.put(2,"duclicate number");
     //   map.put(5,"zilnazayim");
        map.put(6,"hello");

        System.out.println(map);

        // how can read from a map? // read by key  // key cannot be duplicate
       String name = map.get(5);
        System.out.println(map.get(3)); // null
        System.out.println(name);
        System.out.println(map.get(2));
        System.out.println(map.get(5));
        System.out.println(map.get(6));
    }


}
