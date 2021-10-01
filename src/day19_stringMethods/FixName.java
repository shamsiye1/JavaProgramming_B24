package day19_stringMethods;

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {

        // ask teh user to enter their first name and last name

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first name");
        String firstName = scan.next();

        System.out.println("Enter last name");
        String lastName = scan.next();

        String firstUpName = firstName.toUpperCase().charAt(0) + firstName.toLowerCase().substring(1);
        String lastUpName = lastName.toUpperCase().charAt(0) + lastName.toLowerCase().substring(1);

        System.out.println(firstUpName + " " + lastUpName);


    }
}
