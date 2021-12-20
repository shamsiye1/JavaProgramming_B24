package day47_constructors;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

       Item firstItem= new Item("Apples",9,1.33);
        System.out.println(firstItem);
        firstItem.quantity +=5;
        System.out.println(firstItem);
       firstItem.calTotalPrice();
        System.out.println(firstItem);

        Scanner scan= new Scanner(System.in);

       String keepGoing ="yes";

        ArrayList<Item> shoppingList= new ArrayList<>(); // there Item can be object

      while (keepGoing.equalsIgnoreCase("yes")){
          System.out.println("What is the item name?");
          String name= scan.nextLine();

          System.out.println("What is the quantity?");
          int quantity= scan.nextInt();

          System.out.println("What is the unit price?");
          double unitPrice= scan.nextDouble();

          Item item= new Item(name, quantity, unitPrice);
         // System.out.println(item);
         shoppingList.add(item);

          System.out.println("Do you want to keep adding Items?");

         scan.nextLine(); // empty enter input

          keepGoing= scan.nextLine();
      }
        System.out.println("Shopping List: ");
        System.out.println(shoppingList);
    }
}
