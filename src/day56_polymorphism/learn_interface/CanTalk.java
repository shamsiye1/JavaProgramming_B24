package day56_polymorphism.learn_interface;

public interface CanTalk {

    //abstract method
    void speak();


    public static void yell(){
        System.out.println("Yelling!!");
    }

//    public void whisper(){
//
//    } this is abstract so cannot have body

    public default void whisper(){ // this is instance method

        System.out.println("Whispering shh");
    }

}


