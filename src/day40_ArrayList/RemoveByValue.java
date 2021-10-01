package day40_ArrayList;

import java.util.ArrayList;

public class RemoveByValue {
    public static void main(String[] args) {

        ArrayList<String> list= new ArrayList<>();

        list.add("pen");
        list.add("mouse");
        list.add("marker");

        list.remove("mouse");

        System.out.println(list);




    }
}
