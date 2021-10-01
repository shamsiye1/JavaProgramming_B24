package day10_scannerRecap;

import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary");
        double salary= scan.nextDouble();
        System.out.println("How many hours do you work a week");
        double weeklyHour= scan.nextDouble();

        double hourRate= salary /(weeklyHour*52);

     //   System.out.println("Your hour rate is: "+ hourRate);
        System.out.println("With a salary of "+ salary+ " your hourly rate for "+ weeklyHour+ " hours a week is "+ hourRate);

        System.out.println();
        System.out.println("===============================================");

        System.out.println("how many hours do you work?");
        double weeklyHour1= scan.nextDouble();
        System.out.println("Enter your hour rate");
        double hourRate1= scan.nextDouble();

        double salary1= hourRate1* weeklyHour1*52;

        System.out.println("Your total salary is: "+ salary1);



























    }
}
