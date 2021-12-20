package day56_polymorphism.learn_interface;

public interface Mac {

    // String name;  // interface instance variable also need to have value

    String NAME = "Mac";      // same as public static final String name= "Mac";
    String SOFTWARE = "IOS";  // final variable here


    void turnOn();  // public abstract method

    public static void getBrand() {
        System.out.println("Apple");
    }

    public default void type(){  //interface can through default and will have code body
        System.out.println("Typing");
    }




}

class Runner2 { // this main class just for test
    public static void main(String[] args) {

        Mac.getBrand();
        System.out.println(Mac.NAME);
        System.out.println(Mac.SOFTWARE);


    }
}
