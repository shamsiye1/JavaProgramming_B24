package day10_scannerRecap;

import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        byte age= scan.nextByte();

        System.out.println("Enter your favorite number");
        long favorNum= scan.nextLong();

        System.out.println("Are you a student?");
       boolean isStudent= scan.nextBoolean();

        System.out.println(" This is your personal information: ");
        System.out.println("age: "+ age);
        System.out.println("favorite number: "+ favorNum);
        System.out.println("are you a student: "+ isStudent);





































    }
}
