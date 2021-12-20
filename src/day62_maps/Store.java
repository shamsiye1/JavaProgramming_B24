package day62_maps;

import java.util.HashMap;
import java.util.Scanner;

public class Store {

    public static void main(String[] args) {

        // item name - price
        HashMap<String, Double> inventory = new HashMap<>();

        inventory.put("apple", 6.5);
        inventory.put("milk", 10.5);
        inventory.put("perfume", 110.2);
        inventory.put("fruits", 2.99);


        System.out.println(inventory);

        Scanner input = new Scanner(System.in);
        System.out.println("what do you want to buy?");
        String item = input.next();

        if (inventory.containsKey(item)) {

            System.out.println("that item is in stock");
            System.out.println(item + " costs " + inventory.get(item) + "$");
        } else {
            System.out.println("item doesn't exist anymore");
        }

    }


}
