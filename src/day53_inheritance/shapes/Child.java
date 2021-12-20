package day53_inheritance.shapes;

//public class Child extends FinalExamples {
//}  it cannot be extends to parent class, because FinalExample is use final keyword

public class Child extends Parent {

//@Override
//    public static final void method(){
//
//
//} final method  cannot be override

    public static final void method(int a) {

        // final method can overload
    }


}

class Parent {

    public static final void method() {



    }

}