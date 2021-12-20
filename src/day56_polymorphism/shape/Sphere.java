package day56_polymorphism.shape;

public class Sphere extends Shape implements HasVolume {


//      create a sub class of Shape: sphere
//        implements hasVolume
//        implement methods

    double radius;


    @Override
    public double volume() {

        return (4/3)*Math.PI*radius*radius*radius;
    }

    @Override
    public double area() {
        return Math.PI*4*Math.pow(radius,2);

    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
