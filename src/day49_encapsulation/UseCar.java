package day49_encapsulation;

public class UseCar {
    public static void main(String[] args) {
      Car car= new Car("james","LC454585452",20);
        System.out.println(car.driver);
        System.out.println(car.driver.name);
        System.out.println(car.driver.age);
        System.out.println(car.driver.licenceNumber);


        Car car2=new Car("Adam","238482",35);
        System.out.println(car2.driver);

        System.out.println(car2);


    }


}
