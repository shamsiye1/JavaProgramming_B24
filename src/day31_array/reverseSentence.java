package day31_array;

import java.util.Scanner;

public class reverseSentence {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your sentence");
        String sentence= scan.nextLine();

        String[] words= sentence.split(" ");

        String reverse= "";

        for (int i= words.length-1; i>=0; i--){
            reverse += words[i] + " ";

        }

        System.out.println(reverse.trim());
        System.out.println(reverse);
































    }
}
