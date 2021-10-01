package day19_stringMethods;

public class MergeChars {

    public static void main(String[] args) {

        // String one: abc
        // String two: def
        // merge to get: adbecf

        String one = "abc";
        String two = "def";

        String merged= "";
        merged += one.charAt(0);
        merged += two.charAt(0);


        merged += one.charAt(1);
        merged += two.charAt(1);

        merged += one.charAt(2);
        merged += two.charAt(2);

//        merged += one.charAt(0);
//        merged += two.charAt(0);
//        merged += one.charAt(0);
//        merged += two.charAt(0);

        System.out.println(merged);







































    }







}
