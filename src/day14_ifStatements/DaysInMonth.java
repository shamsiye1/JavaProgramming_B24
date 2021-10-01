package day14_ifStatements;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your month number");
        int month = scan.nextInt();

        if (month>=1 &&month<=12){

            if (month==2){
                System.out.println("28 days");
            }else if (month== 4 || month== 6 || month== 9 ||month== 11 ){
                System.out.println("30 days");
            }else {
                System.out.println("31 days");
            }




        }else {
            System.out.println("Invalid month numver. Can only be from 1-12");
        }
















    }
}
