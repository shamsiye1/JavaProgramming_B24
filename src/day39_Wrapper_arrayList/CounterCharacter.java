package day39_Wrapper_arrayList;

import java.util.Scanner;

public class CounterCharacter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = input.next();

        int upper=0, lower=0, num=0, other=0;

        for (char each: email.toCharArray()){

            if (Character.isUpperCase(each)){
            upper++;

            }else if (Character.isLowerCase(each)){
                lower++;

            }else if (Character.isDigit(each)){
                num++;
            }else {
                other++;

            }

        }

        System.out.println("Uppercase: "+upper);
        System.out.println("Lowercase: "+lower);
        System.out.println("Digits: "+num);
        System.out.println("Other: "+other);







    }
}
