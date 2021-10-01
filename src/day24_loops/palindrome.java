package day24_loops;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your word");
        String palindrome= input.next();
        String reverse= "";

        for (int i= palindrome.length()-1; i>=0; i--){

            reverse += palindrome.charAt(i);
        }
        System.out.println(reverse);


        if (palindrome.equalsIgnoreCase(reverse)){
            System.out.println(palindrome+ " is palindrome");
        }else {
            System.out.println(palindrome + " is not a palindrome, \nre-enter your word");

        }








































    }
}
