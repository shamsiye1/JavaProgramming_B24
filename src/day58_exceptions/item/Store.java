package day58_exceptions.item;

public class Store {
    public static void main(String[] args) {

      Eragon obj1 = new Eragon(); // itself

      Book obj2 = new Eragon(); // parent

      Item obj3 = new Eragon(); // parent

      // also have interface for reference



         obj1.use();
        obj2.use();
        obj3.use();

        //new Book("").use();

        obj1.sell();
        ((Eragon) obj2).sell();
        ((Eragon)obj3).sell();
        purchase(new Item("wooden spoon"));
        purchase(obj1);
        purchase(obj2);
        purchase(new Book("Harry Potter"));
    }
                            // reference parameter
    public static void purchase(Item item){
        System.out.println("Purchasing "+item.name);
    }

}
