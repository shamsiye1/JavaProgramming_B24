package day55_abstraction.learn_interface;

public interface First {

    public abstract void write(); // public abstract part is grey, because you don't need it, all methods are public abstract by default

    void read(); // default abstract


}

class Book implements First{

    @Override
    public void write() {

    }

    @Override
    public void read() {

    }
}