package day23_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        String shoppingList = "";
        String addMore;
        int budget=0;

        do {
            System.out.println("Enter your item and its price");

            shoppingList += input.nextLine()+ ", ";

            System.out.println("Do you want to add more? y or n");
            addMore= input.nextLine();
            System.out.println();

        }while (addMore.equalsIgnoreCase("yes"));

        System.out.println("thank you to shopping");
        System.out.println("Your shopping list: "+shoppingList.substring(0,shoppingList.length()-2));






























































    }
}
