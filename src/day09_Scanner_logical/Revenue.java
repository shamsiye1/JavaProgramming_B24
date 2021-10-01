package day09_Scanner_logical;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the product's price");
        double price= scan.nextDouble();

        System.out.println("enter the product's quantity");
        int quantity= scan.nextInt();

       double revenue= price * quantity;

        System.out.println("revenue is "+ revenue);























































    }
}
