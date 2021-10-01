package day09_Scanner_logical;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
      int angleCounter=1;    // this declare means that we can count the angle number dynamically rather than manually enter a angle number, it is more like that loop simple expression
        System.out.println("enter angle"+ angleCounter++);
        double angleOne= scan.nextDouble();

        System.out.println("enter angle "+ angleCounter++);
        double angleTwo= scan.nextDouble();
        System.out.println("enter angle "+ angleCounter++);
        double angleThree= scan.nextDouble();

        System.out.println("enter angle "+ angleCounter++);
        double angleFour= scan.nextDouble();
        double sum = angleOne+angleTwo+angleThree;
        boolean isTriangle= sum==180;
        boolean isCircle= sum==360;

        System.out.println("is triangle: "+ isTriangle);
        System.out.println("is circle: "+ isCircle);
































    }
}
