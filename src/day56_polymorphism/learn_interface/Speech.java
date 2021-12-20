package day56_polymorphism.learn_interface;

public class Speech implements CanTalk{


    @Override
    public void speak() {
        System.out.println("speaking");
    } // this implementation method is necessary

    @Override
    public void whisper() {
        CanTalk.super.whisper();
    }
}
class Runner{
    public static void main(String[] args) {
        Speech speechOjb= new Speech();
        speechOjb.speak();
        speechOjb.whisper();
        // speechObj.yell();  not inherited
        CanTalk.yell();
       // CanTalk.whisper(); whisper is a instance method

    }


}