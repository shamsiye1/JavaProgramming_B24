package day28_nested_loops;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter your range");
        int range = input.nextInt();


        for (int number=2; number <= range; number++){   // number==i actually
            boolean isPrime= true;

            for (int j=2; j< number; j++ ){

                if (number%j==0){
                    isPrime=false;
                    break;
                }

            }
            if (isPrime){
                System.out.print(number+ " ");
            }

        }




























































    }
}
