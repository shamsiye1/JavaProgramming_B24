package day10_scannerRecap;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
       // declare variable name
        String item1, item2, item3, report = "";
        double price1, price2, price3, totalPrice=0;


        System.out.println("Enter Intem1 and its price");
        item1 = input.nextLine();
        price1= input.nextDouble();
        totalPrice+= price1;
        input.nextLine();
        report+= "item1: "+ item1+ " price: "+price1+ ",";        // report = report + "apples";

        System.out.println("Enter Intem2 and its price");
        item2 = input.nextLine();
        price2= input.nextDouble();
        totalPrice+= price2;
        report+= "item2: "+ item2+ " price: "+ price2+",";

        input.nextLine();

        System.out.println("Enter Intem3 and its price");
        item3 = input.nextLine();
        price3= input.nextDouble();
        totalPrice+= price3;
        report+= "item3: "+ item3+ " price: "+ price3+",";


        System.out.println(report);
        System.out.println("total price: "+ totalPrice);








    }
}
