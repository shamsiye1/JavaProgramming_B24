package day17_stirng;

public class StringMethods {
    public static void main(String[] args) {
        String name = "james";

        System.out.println(name.equals("james")); // true
        System.out.println(name.equals("James"));  // false

        System.out.println(name.equalsIgnoreCase("James")); //true

        System.out.println(name.toUpperCase());
        System.out.println(name);

        String lastName="bond";
        lastName.toUpperCase(); // because this one we don't store anywhere, so no use this code.
        lastName= lastName.toUpperCase();
        System.out.println(lastName);

        System.out.println(lastName.toLowerCase());


        System.out.println(lastName.length());



        String word ="Monday  "; // space is also count into character
        int length = word.length();
        System.out.println(length);




















    }






















}
