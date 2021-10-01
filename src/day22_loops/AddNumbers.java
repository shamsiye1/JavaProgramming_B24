package day22_loops;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        double sum=0;
        boolean positiveNumber= true;
        while(positiveNumber){
            System.out.println("Enter a number");
            double number= scan.nextDouble();
           // sum +=number;
          if (number<0){
              positiveNumber=false;

              //System.exit(0);
          }else {
              sum +=number;
          }

        }
        System.out.println("Sum: 0"+sum);







































    }
}
