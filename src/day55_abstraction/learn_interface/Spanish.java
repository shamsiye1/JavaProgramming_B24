package day55_abstraction.learn_interface;

public class Spanish implements Language{  // concrete class


    @Override
    public void hi() {
        System.out.println("Hola");
    }

    @Override
    public void bye() {
        System.out.println("Adios");
    }
}





