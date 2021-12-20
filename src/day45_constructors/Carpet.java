package day45_constructors;

public class Carpet {


    /*

    info:
      width, length, unit price, if its persian

    toString to print the total price

    constructor:
       initialize the variables
       calculate the total price:
         w * l * unit price

         if its persian add 200$

         toString to print the total price

     */

    double width, length, unitPrice, totalPrice;
    boolean isPersian;

    public Carpet(double width, double length, double unitPrice, double totalPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.isPersian = isPersian;

        totalPrice = width*length*unitPrice;
        if(isPersian==true){
            totalPrice +=200;
        }
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width: " + width +
                ", length: " + length +
                ", unitPrice: " + unitPrice +
                ", totalPrice: " + totalPrice +
                ", isPersian: " + isPersian+
                '}';
    }
}
