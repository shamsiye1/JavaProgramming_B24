package day12_if_Statement;

import java.util.Scanner;

public class CheckTime {
    public static void main(String[] args) {
//        Write a Java program to implement following logic using if statement
//        1. if hour is less than 12 noon, greet with Good Morning
//        2. if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon
//        3. if hour is greater than or equal to 3 pm, greet with Good Evening
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your time");
        int hour= scan.nextInt();


        // 24 hour format
       // int hour =6;
        // 11 and before is good morning

        // hour is between 12 - 3 afternoon  3pm==> is 15
        // if hour 3+ evening
        if(hour< 12 && hour >=6) {
            System.out.println("Good morning");
        }
       if (hour>=12 && hour <15){
           System.out.println("Good afternoon");
       }

       if (hour >=15 && hour<22){
           System.out.println("Good evening");
       }
       if ((hour >=22 && hour <=24) || (hour>=0 && hour<6)){
           System.out.println("Good night");
       }
       if (hour>24 || hour<0){
           System.out.println("Invalid hour, please re-enter your time");
       }

























































    }
}
