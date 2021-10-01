package day29_array;

import java.util.Arrays;
import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("How many friends do you want to enter");

       // int size= input.nextInt();
        String[] friendsList= new String[input.nextInt()];

        for (int i= 0; i< friendsList.length; i++){
            System.out.println("Enter friend "+ (i+1));
            friendsList[i]= input.next();

        }

        System.out.println("Whole friends list "+Arrays.toString(friendsList));
















































    }
}
