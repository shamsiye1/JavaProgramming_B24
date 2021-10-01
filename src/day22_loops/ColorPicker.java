package day22_loops;

import java.util.Scanner;

public class ColorPicker {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        String pickedColor="";
        int colorsPicked=0;

        while (colorsPicked<3){
            System.out.println("Enter a color: ");
            String color= scan.nextLine();
         if (!pickedColor.contains(color)){
            pickedColor +=color + ", ";
            colorsPicked++;

         }else {
             System.out.println("Enter another unique color");
         }
        }

        System.out.println("You picked "+pickedColor.trim().substring(0,pickedColor.length()-2));

        pickedColor.trim().substring(0,pickedColor.length()-1); // this mean just remove extra coma and space in the end.


















































    }
}
