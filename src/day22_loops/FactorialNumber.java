package day22_loops;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("enter your number");
        int number= scan.nextInt();
        //int number=5;
        int total=1;

        for (int i = 1; i <= number; i++) {
            total *= i;
        }
//        while (number>1){
//            System.out.println(total+" * "+number+" ");
//            total *= number; // total = total* number;
//            number--;
//        }

        System.out.println(total);





































    }
}
