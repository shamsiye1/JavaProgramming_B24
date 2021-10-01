package day11_if_statements;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("*** Welcome to the ATM ***");

        System.out.println("Enter your passcode");
        int inputPassCode= scan.nextInt();
        int validPassCode= 1235;

        if (inputPassCode== validPassCode){

            System.out.println("Logged in!");
            System.out.println("Select a number" );
            System.out.println("\t1) Check balance");
            System.out.println("\t2) Deposit");
            System.out.println("\t3) Check Withdraw");

            int selection= scan.nextInt();
            if (selection==1){
                System.out.println("Your balance is: $"+ 1_000_000);
            }
            if (selection==2){
                System.out.println("Enter your bills in the slot");
            }
            if (selection==3){
                System.out.println("Take your money from the dispenser");
            }



        }else{
            System.out.println("Invalid passcode");
            System.out.println("please re-enter your passcode");

        }

        System.out.println("*** Thank you to use scotia bank ***");























    }
}
