package day53_inheritance.shapes;

public class Square extends Shape {

    double side;

    public Square(double side) {

        super("Square");
        this.side = side;
    }

    @Override
    public double area() {

        return side * side;
    }

    @Override
    public double perimeter(){
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", side=" + side +
                '}';
    }
}






