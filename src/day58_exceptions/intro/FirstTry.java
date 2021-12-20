package day58_exceptions.intro;

public class FirstTry {
    public static void main(String[] args){

        System.out.println("First line");

        try {

            String s = "java";

            System.out.println(s.charAt(0));
            System.out.println(s.charAt(6)); // out of bound exceptions
        }catch (StringIndexOutOfBoundsException e){ // e is just a name/ reference

            System.out.println("we got exception");
            e.printStackTrace();  // debugging tast
        }




        System.out.println("last line");






    }
}
