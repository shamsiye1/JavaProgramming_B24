package day20_string;

import java.util.Scanner;

public class BadWord {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your message");
        String msg= scan.nextLine();

        boolean hasBadWord= msg.trim().contains("idiot") || msg.trim().contains("dumb") || msg.trim().contains("heck");

        if (hasBadWord){
            System.out.println("Message not sent");
        }else {
            System.out.println("Message sent");
        }



















    }
}
