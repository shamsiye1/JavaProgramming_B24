package day32_array;

import java.util.Scanner;

public class ReverseMiddleWord {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String str= scan.nextLine();
        scan.close();

        String[] arr=str.split(" ");

        String reverse="";

        for (int i= arr[1].length()-1; i>=0; i--){
            reverse +=arr[1].charAt(i);

        }
        System.out.println(arr[0]+ " "+reverse+" "+ arr[2]);




















































    }
}
