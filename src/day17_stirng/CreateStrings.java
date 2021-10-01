package day17_stirng;

public class CreateStrings {
    public static void main(String[] args) {

      String first="java";  // String literal
      //  create a String object in the String pool

      String second = new String("java"); // String using "new" keyword
        // this one will stored in java heap

        System.out.println(first== second);// with String does not check the value
        // it checks the memory location and compares them

        System.out.println(first.equals(second));  // .equals compares the values, not memory location.

        String third= "java";

        System.out.println(first== third);

        String fourth= third;

       /*

         first        -->         "java"           <-----  third

                                    ^
                                  fourth

         five       -->            "Java"


---------------------------------------------------------------------------------
         second        -->        [ "java"  ]     <----

      ===============================================================
       */

        String five = "Java";
         five = five+ " is fun";

        System.out.println(five);

       String six= "Java is fun";
        System.out.println(five==six);










    }
}
