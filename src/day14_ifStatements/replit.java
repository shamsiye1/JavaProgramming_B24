package day14_ifStatements;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.println("what is the farthest planet in the solar system:\na)venus\nb)pluto\nc)neptune");
        String a= s.nextLine();
        if (a.equals("a")){
            System.out.println(a+" is wrong");
        }else if (a.equals("b")){
            System.out.println(a+ " is correct");
        }else if (a.equals("c")){
            System.out.println(a+ " is wrong ");
        }else {
            System.out.println(a+ " is not a valid answer");
        }

        System.out.println("=====================");

        Scanner inp= new Scanner(System.in);
        String name = inp.nextLine();
        if (name.equals("Chen")){
            System.out.println("teacher");
        }else {
            System.out.println("student");
        }




























    }
}
