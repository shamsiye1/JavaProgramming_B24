package day51_inheritance;

public class Library {
    public static void main(String[] args) {

        Book bookOne=new Book();
        bookOne.title = "nazakat batur"; // bookOne has access to 6 instance variables which were made in the Book class

        EBook bookTwo= new EBook();
        bookTwo.title= "nijatning yultuzi";
        bookTwo.size = 50;
        // bookTwo reference has access to 8 instance variables. 6 from Book CLASS AND 2 FROM Ebook class
        bookTwo.read();

        AudioBook bookThree= new AudioBook();
        bookThree.duration= 25;
        bookThree.title="leaders eat last";
        bookThree.narrator= "Asiye";
        //bookThree references has access to 8 instance variables. 6 from the Book class and 2 from AudioBook class

        bookThree.listen();


















    }
}
