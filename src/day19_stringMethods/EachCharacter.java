package day19_stringMethods;

public class EachCharacter {
    public static void main(String[] args) {

      String java="javaaa";
      // charAt methods gives a char based on the index number that you give

        System.out.println(java.charAt(0));
        System.out.println(java.charAt(1));
        System.out.println(java.charAt(2));
        System.out.println(java.charAt(3));
        System.out.println(java.charAt(4));
        System.out.println(java.charAt(5));
       // System.out.println(java.charAt(100)); // if index number doesn't exist then java will give us a out of bounds error.

        char firstLetter= java.charAt(0);

        System.out.println(java.charAt(0)+java.charAt(1)+java.charAt(2)+java.charAt(3));// it will add the AScii values of the char and print number
        System.out.println(""+ java.charAt(0)+java.charAt(1)+java.charAt(2)+java.charAt(3)); //when char + String it will return ===> String (it means by adding the empty space we can do concatenation and get the character value, not addition)  //   "" ==> this is called String type.









    }
}
