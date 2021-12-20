package day62_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MulticityInMap {
    public static void main(String[] args) {

        ArrayList<String> usa = new ArrayList<>(Arrays.asList("chicago","new york","virginia"));
        ArrayList<String> europe = new ArrayList<>(Arrays.asList("paris","rome","berlin","sivas"));
        ArrayList<String> asia = new ArrayList<>(Arrays.asList("urumqi","kashghar","kumul","ghulja"));
        Map<String, ArrayList<String>> countries = new HashMap<>();

        countries.put("usa", usa);
        countries.put("europe", europe);
        countries.put("asia",asia);

        System.out.println(countries);
                              // this one return each key
        for(String continent : countries.keySet()){               // this one can get value
            System.out.println("Cities in "+ continent + " are "+ countries.get(continent));

        }
        System.out.println();
        //print first letter of each city

        for (String continent: countries.keySet()){
            System.out.println("Cities in "+continent);

            for(String city : countries.get(continent)){
                System.out.println(city.substring(0,1));
            }
        }


    }
}
