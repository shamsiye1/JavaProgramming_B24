package day49_encapsulation;

public class Car {

    Driver driver;  // String name;   ==> in here String as class
    // in above Driver also the one class;
    // in here Driver driver just a references

    public Car(String name, String licenseNumber, int age) {
        driver = new Driver(name, licenseNumber, age); // create a new Driver object

    }

}
//
//    String driver;  // may include name, license number, age
//    String engine;  // may include cylinder, horsepower

class Driver {
    String name;
    String licenceNumber;
    int age;

    public Driver(String name, String licenceNumber, int age) {
        this.age = age;
        this.name = name;
        this.licenceNumber = licenceNumber;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", licenceNumber='" + licenceNumber + '\'' +
                ", age=" + age +
                '}';
    }
}









