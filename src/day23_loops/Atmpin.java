package day23_loops;

import java.util.Scanner;

public class Atmpin {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        int validPin= 1234;
        int userPin;
        int attempts =0;


        do {
            System.out.println("Enter your pin");
            userPin= scan.nextInt();
            attempts++;
        }while (attempts<3 && userPin != validPin);

        if (userPin== validPin){
            System.out.println("Welcome, your are logged in");

        }else {
            System.out.println("Invalid pin, your account locked out");
        }





























































    }
}
