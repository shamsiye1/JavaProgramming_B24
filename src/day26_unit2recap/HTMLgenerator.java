package day26_unit2recap;

import java.util.Scanner;

public class HTMLgenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What html tag do you want to generate");
        String str= input.next();  //  li^3

        String tag= str.substring(0, str.indexOf("^"));
        System.out.println(tag);

        int indexOfCarrot= str.indexOf("^");
        String strNum = str.substring(indexOfCarrot+1);

      //  System.out.println(strNum);
        //        int nubmer= str.substring(indexOfCarrot+1);

        int num= Integer.parseInt(strNum);
        String finalResultHtml= "";

        for (int i=0; i< num; i++){
            finalResultHtml += "<"+ tag+ ">" + "</"+tag+">";

        }

        String ta= "a";
        ta = ta+ "b";
        String tb= "c";
        ta= ta+tb;
         ta.replace('c','d');
        System.out.println(ta);

        System.out.println(finalResultHtml);

//        String str="Hello World";
//        str.trim();
//        int z= str.indexOf(" ");
//        System.out.println(z);

//        String batch= "   batch 22    ";
//        int z= batch.trim().length();
//        System.out.println(z);
//
//String s1="abcdefg";
//String s2= ""+ s1.charAt(0)+ s1.charAt(s1.length());
//        System.out.println(s2);

//        String s1="wooden spoon";
//        String s2= s1.substring(s1.indexOf("s"));
//        System.out.println(s2);
























































    }
}
