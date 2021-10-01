package day09_Scanner_logical;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class NumberEqual {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number 1: ");
        double num1= scan.nextDouble();

        System.out.println("enter number 2: ");
        double num2= scan.nextDouble();

        boolean equal= num1==num2;

        System.out.println(num1+" is equal to "+num2+" : "+equal);
































    }
}
