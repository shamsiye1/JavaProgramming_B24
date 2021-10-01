package day05_variables;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("enter a three number");
        int one = scan.nextInt();
        int two= scan.nextInt();
        int three = scan.nextInt();

        String msg= one+ " + "+ two+ " + "+ three+ " =";
        System.out.println(msg+(one+two+three));














    }
}
