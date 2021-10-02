package day44_custom_classes;

public class Animal {

    // create animal instance variable

    String species;
    String size;
    int numberOfLegs;
    boolean canFly;
    boolean isMammal;
    double weight;
    double lifeSpan;


    // methods

    // no static means these are instance methods
    // instance method is just action belongs every each object. representation copy of your class
    public void eat(){
        System.out.println(species +" is eating");
    }

    public void sleeping(){
        System.out.println("This "+size+" animal is sleeping");
    }

    public static void sleeping2(){
        System.out.println("This animal is sleeping");
    }



}
