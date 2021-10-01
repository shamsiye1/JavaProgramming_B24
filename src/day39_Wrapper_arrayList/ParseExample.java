package day39_Wrapper_arrayList;

import java.util.Scanner;

public class ParseExample {
    public static void main(String[] args) {

        // converting the String characters to a number

        String year="2009";
        int intYear= Integer.parseInt(year);

        System.out.println(year);
        System.out.println(intYear);

        System.out.println(year+1);
        System.out.println(intYear+1);

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the text");
        String text = input.nextLine();

        String[] arr=text.split(" ");
        String ageText= text.split(" ")[2]; // arr[2]

        /*
             text.split(" ") --> ["i","am","10","years","old"]
             arr[2] --> second element of the array
         */

        int age= Integer.parseInt(ageText);
        System.out.println("In 5 years you will be "+(age+5));

        String priceStr="112.99";
        double priceDouble= Double.parseDouble(priceStr);
        System.out.println(priceDouble);

























    }
}
