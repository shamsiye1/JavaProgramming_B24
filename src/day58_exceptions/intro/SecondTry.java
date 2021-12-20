package day58_exceptions.intro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondTry {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Enter a number");
            int num = input.nextInt();

            System.out.println("Enter another number");
            int num1 = input.nextInt();

            System.out.println(num / num1);


        } catch (InputMismatchException e) {

            System.out.println("Invalid try, please enter a number");

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally{
            System.out.println("test finish");
        }


    }
}
