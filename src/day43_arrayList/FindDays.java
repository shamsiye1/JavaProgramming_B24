package day43_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDays {

    /*

       create a method that will return an Arraylist with all the days
       mon, tues.......

       overload the method so it accept the int number - which day of the week they want String

       input 1
       output: monday

     */




    public static void main(String[] args) {

        System.out.println(getDays(5));
        System.out.println(getDays());

        ArrayList<String> days= getDays();
        System.out.println(days.containsAll(Arrays.asList("Monday","Friday","Sunday")));
        System.out.println(days.containsAll(Arrays.asList("Monday","aPRIL","Sunday")));

    }


    public static ArrayList<String> getDays(  ){

        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Sunday","Saturday"};

        ArrayList<String> daysInList= new ArrayList<>(Arrays.asList(days));



        return daysInList;
    }

    public static String getDays(int day){

        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Sunday","Saturday"};
        ArrayList<String> daysInList= new ArrayList<>(Arrays.asList(days));


        return daysInList.get(day-1);
    }













































}
