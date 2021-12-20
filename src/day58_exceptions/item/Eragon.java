package day58_exceptions.item;

public class Eragon extends Book{


    @Override
    public void use() {
        System.out.println("reading Eragon");
    }

    public Eragon() {
        super("eragon");
    }


    public void sell(){
        System.out.println("Selling Eragon books");
    }
}

