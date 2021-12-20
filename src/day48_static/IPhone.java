package day48_static;

public class IPhone {

    String model;
    String color;
    double price;
    String storage;

    static String brand;
    static String OS;

    static {

        brand="apple";
        OS= "IOS";
    }

    public IPhone(String model, double price){
        this.model=model;
        this.price=price;
    }

    public IPhone(String model, String color, double price, String storage){

        this.model=model;
        this.color=color;
        this.price=price;
        this.storage=storage;

    }

    @Override
    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", storage='" + storage + '\'' +
                '}';
    }
}
