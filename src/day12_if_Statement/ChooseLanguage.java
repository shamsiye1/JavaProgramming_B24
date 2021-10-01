package day12_if_Statement;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
//        add a new class ChooseLanguage  add main method
//        "Choose your language"
//        int selection -> 1 : "hello, thank for your call"
//          -> 2 : "hola, gracias para llamar"
//          -> 3 : "merhaba, aradiginiz icin tesekkurler"
//          -> 4 : "privet, spasibo za vash zvonok"
//          -> 5 : "Merci ,pour votre appel"
//                -----> "lets talk in english, hello"

        Scanner scan= new Scanner(System.in);
        System.out.println("Choose your language. Pick the number you want");
        System.out.println("\t1)English \n\t2)Spanish \n\t3)Turkish \n\t4)Russian \n\t5)French");
        int selection= scan.nextInt();
        String result="";

        if(selection==1){
            result=  "hello, thank for your call";
        }else if (selection==2){
            result= "hola, gracias para llamar";
        }else if (selection==3){
            result= "merhaba, aradiginiz icin tesekkurler";
        }else if (selection==4){
            result= "privet, spasibo za vash zvonok";
        }else if (selection==5){
            result= "Merci ,pour votre appel";
        }else{
            result= "lets talk in english, hello";
        }

        System.out.println(result);











int num1=50;
int num2=200;
num2=num1;

        System.out.println(num1);
        System.out.println(num2);

long a = 30l;
long b =(short)a;
        System.out.println(b);

        float a1 =100.987_6543f;
        short b1=(byte)a1;
        byte c= (byte) b1;
        System.out.println(c);
        long a2=3_000l;
        double b2=(float)a2;
        System.out.println(b2);

        System.out.println("result a"+0+1);
        System.out.println("result b"+(1)+(2));



































    }
}
