package day10_scannerRecap;

import java.util.Scanner;

public class PlaceOrder {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("enter a product name");
        String productName= scan.nextLine();

        System.out.println("enter a price");
        double price= scan.nextDouble();

      //  scan.nextLine();  it is not needed, because after double that is a int .

        System.out.println("enter the quantity");
        int quantity= scan.nextInt();

        scan.nextLine();  // there need to use empty line

        System.out.println("enter your full name");
        String fullName= scan.nextLine();

        System.out.println(fullName+", your order for "+ quantity+ " "+ productName+ " has been placed."+"\n your total is $"+ (price*quantity));
























    }
}
