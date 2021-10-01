package day19_stringMethods;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

//         ask the usr enter first name
//        ask the user to enter their last name
//                then print the initials
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName= scan.next();
        System.out.println("Enter your last name:");
        String lastName= scan.next();

        String initials= ""+ firstName.charAt(0)+lastName.charAt(0);
        System.out.println(initials.toUpperCase());
        System.out.println(""+ firstName.toUpperCase().charAt(0)+lastName.toUpperCase().charAt(0));















    }
}
