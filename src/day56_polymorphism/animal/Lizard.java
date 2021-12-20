package day56_polymorphism.animal;

public class Lizard extends Reptile{

    @Override
    public void eat() {
        System.out.println("Lizard is eating -- FROM CHILD");


    }


}


class Wild{

    public static void main(String[] args) {

        // make your lizard object with all references

        Lizard obj1= new Lizard(); // Lizard objects

        Reptile obj2= new Lizard(); // Lizard objects

        Animal obj3= new Lizard();  // Lizard objects

        obj1.eat();
        obj2.eat();
        obj3.eat();





    }



}