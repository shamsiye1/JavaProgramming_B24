package day29_array;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        String city1="San Fransisco";
        String city2="Moscow";
        String city3="Madison";
        String city4="Tokyo";
        String city5="Bagdad";


        // this is the array to hold multiple data
        // defining a String array with city information

        String[] cities={"San Fransisco", "Moscow","Madison", "Tokyo","Bagdad"};

        //  how do read each individual city / element

        System.out.println(cities[0].toUpperCase());
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);

        // how can be print the whole array at one time

        System.out.println(Arrays.asList(cities));
        System.out.println(Arrays.toString(cities));




















































    }
}
