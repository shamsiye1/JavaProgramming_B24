package day28_nested_loops;

public class ReverseSecondWord {
//    Reverse only second word
//    Given a String with three words separated by spaces. Reverse only the second word and return the modified String
    public static void main(String[] args) {

       String s = "I love ghcfhg ngv java";
       String fixedStr ="";

       for (int i=0; i< s.length(); i++){

           if (s.charAt(i)== ' '){

               String reverse="";
               for (int j= s.lastIndexOf(' '); j>=i; j--){
                   reverse +=s.charAt(j);
               }
               fixedStr +=reverse;
               i = s.lastIndexOf(' ');

           }else{
               fixedStr += s.charAt(i);
           }
           //

       }
        System.out.println(fixedStr);





































    }
}
