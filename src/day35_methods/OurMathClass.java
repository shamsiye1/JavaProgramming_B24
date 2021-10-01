package day35_methods;

public class OurMathClass {

    //    add
//    subtract
//    multiply
//    divide
    public static void main(String[] args) {

        add(0.5, 4.5);
        add(1, 2);
        multiply(45, 78);
        division(0, 5);
        division(52, 0);
    }

    public static void add(double numOne, double numTwo) {
        System.out.println(numOne + " + " + numTwo + " = " + (numOne + numTwo));
    }

    public static void multiply(int numOne, int numTwo) {
        System.out.println(numOne + " * " + numTwo + " = " + (numOne * numTwo));

    }


    public static void division(double numOne, double numTwo) {

        if (numTwo != 0) {
            System.out.println(numOne + " / " + numTwo + " = " + (numOne / numTwo));

        } else {
            System.out.println("Cannot divide by 0");
        }


    }


}
