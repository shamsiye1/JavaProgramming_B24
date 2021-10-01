package day14_ifStatements;

import java.util.Scanner;

public class CalculatorV2 {
    public static void main(String[] args) {

   // ask teh user to enter 2 number
   // operator - string

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1");

        double numberOne = scan.nextDouble();

        System.out.println("Enter number 2");
        double numberTwo= scan.nextDouble();

        System.out.println("Enter operator\n\t+ - * / %");
        String operator= scan.next();

        boolean isValidOperator= operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("%");

        double result= 0;
        if (isValidOperator){

         if(operator.equals("+") ){
             result= numberOne + numberTwo;
         }else if (operator.equals("-") ){
             result= numberOne-numberTwo;
         }else if (operator.equals("*") ){
             result= numberOne*numberTwo;
         }else if (operator.equals("/") && numberTwo!=0){
             result= numberOne/numberTwo;
         }else if (operator.equals("%") ){
             result= numberOne%numberTwo;
         }



        }else {
            System.out.println(operator+ " is not a valid operator");
        }
        if (isValidOperator){
            System.out.println(numberOne+ " "+operator+ " "+ numberTwo+ " = "+result);
        }




    }
}
