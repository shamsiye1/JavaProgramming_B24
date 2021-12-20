package day46_constructors;

public class ThisKeyword {

    int a=100;   // inside the class, this is instance variable.

    public ThisKeyword(int a){  // this int a is local variable
        a=400;
    }

    public static void main(String[] args) {

        ThisKeyword obj= new ThisKeyword(10);
        System.out.println(obj.a);
    }


}
