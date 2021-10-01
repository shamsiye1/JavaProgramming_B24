package day29_array;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {

        int[] nums={4,5,9,8,3,11,55,12};

        int sum=0;
        for (int i=0; i< nums.length; i++){
            sum +=nums[i];

        }

        double average= sum/nums.length;
        System.out.println("Sum of these number is: "+ sum);
        System.out.println("Average is: "+ average);

        Scanner scan= new Scanner(System.in);

        System.out.println("How many numbers do you want to enter");
        int size= scan.nextInt();

        int[] numbers= new int[size];
        int sumOf= 0;

        for (int i=0; i< size; i++){
            System.out.println("Enter your "+ (i+1)+ "_ number");
            numbers[i]= scan.nextInt();

            sumOf +=numbers[i];

        }

        System.out.println("Your Array value: "+ Arrays.toString(numbers));
        System.out.println("Your average value is: "+ sumOf/size);
        System.out.println("Your average value is: "+ sumOf/numbers.length);




    }

}
