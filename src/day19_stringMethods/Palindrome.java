package day19_stringMethods;

public class Palindrome {
    public static void main(String[] args) {
        String word= "cba";

        String reverse= ""+word.charAt(2)+ word.charAt(1)+ word.charAt(0) ;
        System.out.println(reverse);

        if (word.equals(reverse)){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }

//12321
        String number="12321";
        String reverse1= ""+ number.charAt(4)+ number.charAt(3)+number.charAt(2)+ number.charAt(1)+number.charAt(0);
        System.out.println(reverse1);
        System.out.println(number.equals(reverse1));














    }
}
