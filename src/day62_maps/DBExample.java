package day62_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DBExample {
    // DB ==> data base
    public static void main(String[] args) {

        HashMap<String, String> person1 = new HashMap<>();

        person1.put("first_name", "james");
        person1.put("last_name", "bond");
        person1.put("age", "40");

// store objects in arrayList

        ArrayList<Map<String, String>> allPeople = new ArrayList<>();

        allPeople.add(person1);

        // i want to know the first name
        System.out.println(allPeople.get(0));

        // allPeople --> ArrayList
        // allPeople.get(0) --> first map object





    }
}
