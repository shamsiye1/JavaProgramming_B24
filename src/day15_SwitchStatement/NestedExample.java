package day15_SwitchStatement;

import java.util.Scanner;

public class NestedExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a score");
        int score = input.nextInt();

        if (score >= 75) {
            System.out.println("Good score, keep working hard");

            if (score >= 90) {
                System.out.println("You get 5 gold stars");

                if (score > 95) {
                    System.out.println("you are ausome");
                }
            } else if (score > 80) {
                System.out.println("You get 4 gold stars");
            } else {
                System.out.println("You get 3 gold stars");
            }


        } else {
            System.out.println("Good try");
            if (score >= 60) {
                System.out.println("You get 1 star");
            }
            if (score >= 50) {
                System.out.println("You should re-take it");
            } else {
                System.out.println("Retake it twice");
            }
        }


    }
}
