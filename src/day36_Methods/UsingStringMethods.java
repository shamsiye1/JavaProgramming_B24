package day36_Methods;

import my_Utilitiess.StringUtil;

import java.util.Scanner;

public class UsingStringMethods {
    public static void main(String[] args) {

        StringUtil.reverse("mizanim");
        System.out.println(StringUtil.reverse("mizanim"));

        String palinDrom="racecar";
        String reverse= StringUtil.reverse(palinDrom);

        System.out.println(palinDrom.equals(reverse));

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter some words to reverse");
        System.out.println(StringUtil.reverse(scan.nextLine()));

        System.out.println("Enter your first name");
        System.out.println(StringUtil.getProperFormat(scan.next()));

        System.out.println("Enter your last name");
        System.out.println(StringUtil.getProperFormat(scan.next()));






























    }
}
