package day16_switch;

import java.util.Scanner;

public class TernaryPractice2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the items name");
        String itemName= scan.nextLine();

        System.out.println("Enter the price of "+ itemName);
        double itemPrice = scan.nextDouble();

        System.out.println("Do you have prime");
        String hasPrime = scan.next();

        // add shipping cost of 5$ if they don't have prime

        double finalPrice =  hasPrime.equals("yes")? itemPrice : itemPrice +5;
        System.out.println("Your total price for "+ itemName+ " $"+ finalPrice);
    }
}
