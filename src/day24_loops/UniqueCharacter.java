package day24_loops;

import java.util.Scanner;

public class UniqueCharacter {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next().toUpperCase();

        System.out.println("Enter a letter");
        char letter= scan.next().charAt(0);

        int count=0;

        for (int i=0; i<word.length(); i++){

            //word +=word.charAt(i);
            if (word.charAt(i)== letter){

                count ++;


               // letter++;
            }


        }

        if(count==1){
            System.out.println(""+letter+ " is a unique ");
        }else if (count==0){

            System.out.println(letter+" was not in "+word);
        } else{
            System.out.println("no unique letter in "+ word);
        }








        //        System.out.println(""+letter+count);

























    }


}
