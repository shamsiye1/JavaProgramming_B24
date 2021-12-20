package day62_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestScenario {
    public static void main(String[] args) {

        List<Map<String, String>> data = new ArrayList<>();
        data.add(helper("james",null, null)); // index 0

        data.add(helper("jamie","20","IL"));  // index 1
        data.add(helper(null,null,null));    // index 2
        data.add(helper(null,"30","VA"));  // index 3

        // Scenario: Database should not have null inputs
        System.out.println(data);

        for (Map<String, String> each : data){ // iterates through the ArrayList

            for (String value : each.values()){  // iterates through all the values in each map

               if (value == null){

                   System.out.println("test failed");
               }
            }

        }


    }

    public static Map<String, String> helper(String v1, String v2, String v3){
        Map<String, String> map = new HashMap<>();
        map.put("name", v1);
        map.put("age",v2);
        map.put("state", v3);
        return map;


    }




}
