package day26_unit2recap;

import java.util.Scanner;

public class MultiplyEnd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your text");
        String text = scan.nextLine();

        System.out.println("Enter how many times you want to repeat the end");

        int repeat= scan.nextInt();

        for (int i=0; i< repeat; i++){
            text += text.charAt(text.length()-1);
        }
        System.out.println(text);
















































    }
}
