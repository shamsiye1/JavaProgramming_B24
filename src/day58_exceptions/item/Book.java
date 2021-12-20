package day58_exceptions.item;

public class Book extends Item{

    @Override
    public void use(){
        System.out.println("reading a book");
    }


    public Book(String name) {
        super(name);
    }
}
