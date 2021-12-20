package day50_inheritance;

public class UsingAnimal {
    public static void main(String[] args) {

        Animal animal= new Animal();
        animal.age=10;

        // dog has access 4 variables
        Dog dog= new Dog();
        dog.hasTail= true;

        Lion lion= new Lion();
        lion.numberOfClaws=5;
        lion.roar();

        // lion has access to 5 variables and 1 method.













    }
}
