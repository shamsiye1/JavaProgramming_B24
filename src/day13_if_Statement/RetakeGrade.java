package day13_if_Statement;

import java.util.Scanner;

public class RetakeGrade {
    public static void main(String[] args) {

/*Write a program that will give the grade after the retake. The program should read a score of the test and which attempt it was.

    If its the first attempt -> subtract 10%
    If its the second attempt -> subtract 20%
    If its the third attempt -> subtract 35%
*/

        Scanner scan = new Scanner(System.in);
        System.out.println("What attempt number is this?");
        int attempt = scan.nextInt();

        System.out.println("what is your grade after " + attempt);
        double grade = scan.nextDouble();


        double finalGrade = 0;

        if (attempt == 1) {
            finalGrade = grade - (grade * 0.1);  // 80 ==> 80*.1 = 80- 8= 72
        } else if (attempt == 2) {
            finalGrade = grade - (grade * 0.2);
        } else if (attempt == 3) {
            finalGrade = grade - (grade * 0.35);
        }

        System.out.println("after attemp " + attempt + " your final grade is " + finalGrade + "%");


    }
}
