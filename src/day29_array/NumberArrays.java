package day29_array;

import java.util.Arrays;
import java.util.Scanner;

public class NumberArrays {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int[] ages={23,5,6,88,99,55,22,45,78, 10, 195, 10};

        System.out.println(ages.length);
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[ages.length-2]);


        for (int i=0; i< ages.length; i++){

            System.out.print(ages[i]+ " ");

        }

        System.out.println();
        double[] scores= {95,33,6.6,4.5,96,55.12};
        System.out.println(Arrays.toString(scores));

        System.out.println(scores[0]+ scores[1]);
       // System.out.println(""+scores[0]+ scores[1]);   ===> it became concatenation








































    }

}
