package day62_maps;

import java.util.HashMap;
import java.util.Map;

public class LoopingMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println(map.keySet());
        System.out.println();
        for (String key: map.keySet()){
            System.out.println("the key is: "+ key);
            System.out.println("the value is: "+ map.get(key));
            System.out.println();
        }












    }
}
