package day49_encapsulation;

public class ReviewStatic1 {

  static int i=6;
  int a=4;

    public static void main(String[] args) {

     //   System.out.println("A");

       // method1();  //when we call method then it will executed
        //new ReviewStatic1(); // create the object and call then our constructor will execute first
    }

    public ReviewStatic1(){
        System.out.println("B");
    }

    static{  // static block will go first because of its design, and just run one time
        System.out.println("C");

     //   System.out.println(a);


    }

    public static void method1(){
        System.out.println("D");
        System.out.println(i);
      //  System.out.println(a);  instance reference cannot accept by static method.   static accept static
    }

    public void method2(){
        System.out.println(i);
        System.out.println(a);
    }


}
