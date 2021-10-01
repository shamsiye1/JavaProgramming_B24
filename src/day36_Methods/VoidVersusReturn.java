package day36_Methods;

public class VoidVersusReturn {
    public static void main(String[] args) {
        sayHello();
     //   String s=sayHello();
      //  System.out.println(sayHello());

        String bye =sayBye();
        System.out.println(bye);
        System.out.println(sayBye());

        String s=" java";
        char c=s.charAt(0);
        int i =s.length();
        char[] arr=s.toCharArray();
        String sub= s.substring(0,1);



    }

    // this is a void method with no params
    public  static void sayHello(){

        System.out.println("Hello World");

    }

    public static String sayBye(){

        return "Bye world";
    }






















}
