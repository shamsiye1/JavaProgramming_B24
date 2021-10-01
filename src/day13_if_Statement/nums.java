package day13_if_Statement;

import java.util.Scanner;

public class nums {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a two number");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        String result="";

        if (num1== num2){
            result= num1+ " and "+num2+ " are equal";
        }else if (num1> num2){
            result= num1+ " is greater than "+ num2;
        }else {
            result= num2+ " is greater than "+ num1;
        }

        System.out.println(result);








    }
}
