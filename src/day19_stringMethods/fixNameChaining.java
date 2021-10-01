package day19_stringMethods;

import java.util.Scanner;

public class fixNameChaining {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter first name");
        String firstName = scan.nextLine().trim().toLowerCase();

        System.out.println("Enter last name");
        String lastName = scan.nextLine().trim().toLowerCase();

        System.out.println(firstName);
        System.out.println(lastName);

        String fixedFirstName= firstName.substring(0,1).toUpperCase()+ firstName.substring(1);
        String fixedLastName= lastName.substring(0,1).toUpperCase()+ firstName.substring(1);

        System.out.println(fixedFirstName);
        System.out.println(fixedLastName);




















    }
}
