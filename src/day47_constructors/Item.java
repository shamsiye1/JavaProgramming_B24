package day47_constructors;

public class Item {

    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    public Item(String name, int quantity, double unitPrice){

        this.name=name;
        this.quantity=quantity;
        this.unitPrice=unitPrice;

       // totalPrice= quantity*unitPrice;  // we can do it here or best way is use another method to calculate the total price;

        // or other way is we can directly call the caltotalPrice methods, we can use every updating
        calTotalPrice();
    }

    public Item(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "ITEM: " + name +
                "\nQuantity: " + quantity +
                "\nTotal Price: " + "$"+totalPrice;
    }

    public  void calTotalPrice(){  // this is instance method so we cannot use static

     totalPrice= quantity*unitPrice;

    }



}
