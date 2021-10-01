package day43_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Recap {
    public static void main(String[] args) {

        ArrayList<String> list= new ArrayList<>();
        list.add("water");
        list.add("items");
        list.add("run");
        //list.add("items");

        String[] arr={"one","two"};

        ArrayList<String> second= new ArrayList<>(list);

        second.add("pen");
        System.out.println(list);
        System.out.println(second);


        ArrayList<String> third= new ArrayList<>(Arrays.asList(arr));

        System.out.println(third);










    }
}
