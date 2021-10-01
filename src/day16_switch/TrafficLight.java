package day16_switch;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        boolean isGreen = false ;
        String action = (isGreen) ? "go": "stop";
        System.out.println(action);

        String name= "nadir";

        String className= name.endsWith("nadir") ? "soft skills" : "java";
        System.out.println(className);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number= scan.nextInt();

        System.out.println(number%2==0? "even number" : "odd number");

        System.out.println("Enter number one");
        double numberOne=  scan.nextDouble();
        System.out.println("Enter number two");
        double numberTwo= scan.nextDouble();

        double max= numberOne> numberTwo ? numberOne : numberTwo;
        System.out.println(max);








































    }
}
