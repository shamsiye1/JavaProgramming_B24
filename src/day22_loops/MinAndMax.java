package day22_loops;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int count = 1;
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        while (count <=5){
            System.out.println("Enter your "+count+"_number");
            int number= input.nextInt();
            if (number> max){
                max=number;
            }
            if (number< min){
                min= number;
            }
            count++;
        }

        System.out.println(max+" is maximum");
        System.out.println(min+" is minimum");

        int counter=0;
        double min2= Integer.MAX_VALUE;
        while (counter<5){

            System.out.println("Enter free for your "+(counter+1)+"_number");
            double number2= input.nextDouble();
            if (number2<min){
                min2=number2;
            }

            counter++;
        }
        System.out.println("The maximum number is: "+max);
        System.out.println("The minimum number is: "+min2);





































































    }
}
