package day13_if_Statement;

public class StringCompare {
    public static void main(String[] args) {

       String city="Chicago";
       if (city.equals("mclean")){
           System.out.println("city is virginia");
       }else {
           System.out.println("city is not in virginia");
       }

       if (city.equalsIgnoreCase("chicago")){
           System.out.println(city+ " is illinois");
       }else {
           System.out.println(city+ " is not illinois");
       }

       String str = "java";
       String str2 = "javascript";

       if (!str.equals(str2)){
           System.out.println("Strings are not equal");
       }else {
           System.out.println("Strings are equal");
       }






































    }
}
