package day29_array;

import java.util.Scanner;

public class PickMonth {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

       String[] months= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Nov","Dec"};
        System.out.println("Enter a month number: ");
       int num= scan.nextInt();

        System.out.println("The month you picked is: "+ months[num-1]);































































    }
}
