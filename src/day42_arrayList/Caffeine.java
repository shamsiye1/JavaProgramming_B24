package day42_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {

    /*
    Arraylist of caffeinated drinks
    figure out huw much caffeine each drink has , store than into a new Arraylist
     */

    public static void main(String[] args) {
// this is all the defined information to work with
        String[] allDrinks = {"coffee","tea","monster","red bull","cok","pepsi","bang" ,"apple juice"};
        ArrayList<String > drinkList = new ArrayList<>(Arrays.asList(allDrinks)); //use Arrays.asList reason  ==> quickly to fill our list
        // array to arrayslist to make an arraylist with values right away

        ArrayList<Integer> caffeineAmount= new ArrayList<>();
        // the for each loop goes through every drink element and puts the caffeine amount into teh other arraylist


        for ( String eachDrink: drinkList ){
            int caffeineNum= 0;

            switch (eachDrink){

                case "coffee":
                    caffeineNum=80;
                    break;
                case "monster":
                case "red bull":
                case "bang":
                    caffeineNum=100;
                    break;
                case "tea":
                    caffeineNum=50;
                    break;
                case "coke":
                case "pepsi":
                    caffeineNum=70;
                    break;
                case "apple juice":
                    caffeineNum=0;
                    break;
            }

            caffeineAmount.add(caffeineNum);  // actual adding of the caffeine number to


        }


       System.out.println(drinkList);
        System.out.println(caffeineAmount);

        // printing the drinks and caffeine amounts together
        System.out.println("========Caffeine Table ==========");

        for (int i=0; i< drinkList.size(); i++){

            System.out.println("Drink: "+drinkList.get(i));
            System.out.println("Caffeine amount: "+caffeineAmount.get(i));


        }




    }
}
