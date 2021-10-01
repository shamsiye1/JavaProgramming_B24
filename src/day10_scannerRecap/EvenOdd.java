package day10_scannerRecap;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number ");
        long number= scan.nextLong();

        boolean isEven = number % 2==0;
        boolean isOdd= number%2==1;

        System.out.println(number + " is a even number: "+ isEven);
        System.out.println(number + " is a odd number: "+ isOdd);










































    }
}
