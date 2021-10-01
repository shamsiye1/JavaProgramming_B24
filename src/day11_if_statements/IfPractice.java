package day11_if_statements;

import java.util.Scanner;

public class IfPractice {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("enter your hourly rate: ");
        double hourlyRate= scan.nextDouble();
        System.out.println("how long do your work a week?");
        double hoursWorked= scan.nextDouble();

        double netPay;
        String message;
        if (hoursWorked> 40){
            // over time calculation
            System.out.println("your are a workaholic ");
            double overTimeHours= hoursWorked -40;
            netPay = hourlyRate* 40 ;
            netPay += overTimeHours * hourlyRate* 1.5;
            message = "Wow, you worked "+ hoursWorked + " hours so you got paid for " + overTimeHours+ " hours overtime, so your total net pay is: "+ netPay;
        }else{
            netPay= hourlyRate*hoursWorked;
            System.out.println("Hi, normal man");
            message= "You worked "+ hoursWorked + " hours, your total net pay is: "+ netPay;

        }

        System.out.println(message);























































































    }
}
