package day56_polymorphism.shape;

public class Circle extends Shape {

//       create a sub class of Shape: circle
//        implements methods

    double radius;


    @Override
    public double area() {
        return Math.PI*radius*radius;
        // Math.PI * Math.pow(radius, 2) ===> this is another way calculate area

    }

    @Override
    public double perimeter() {
        return 2* Math.PI * radius ;
    }
}
