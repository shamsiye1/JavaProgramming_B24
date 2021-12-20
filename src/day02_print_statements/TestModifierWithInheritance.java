package day02_print_statements;

import day51_inheritance.Modifier;

public class TestModifierWithInheritance extends Modifier {
    public static void main(String[] args) {

        Modifier obj= new Modifier();

        System.out.println(obj.A);
      //  System.out.println(obj.B);  // protected
      //  System.out.println(obj.C);  // default
        //   System.out.println(obj.D); // cannot be accessed because it is private

        TestModifierWithInheritance obj2= new TestModifierWithInheritance();
        System.out.println(obj2.A);
        System.out.println(obj2.B);


    }





}
