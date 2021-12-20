package day54_abstraction.hiding;

public class A {

    public static void staticMethod(){
        System.out.println("AAAAA");
    }

    public void instanceMethodA(){
        staticMethod();
    }

}



