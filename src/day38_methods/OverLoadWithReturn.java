package day38_methods;

public class OverLoadWithReturn {

    public  static void method(){
        System.out.println("void method - no params");
    }

    public static void method(int a){

        System.out.println("int method - int params");
    }

    public static void method(String s){

        System.out.println("String method - String params");
    }

}
