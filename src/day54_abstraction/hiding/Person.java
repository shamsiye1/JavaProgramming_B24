package day54_abstraction.hiding;

public class Person {

    String name="Nadiye Reyim ";

}

class Baby extends Person{

    String name="Zilnaz Muradel"; // by creating another name variable in the sub class, he hide the name from the parent.

     



}

class Runner{
    public static void main(String[] args) {

        Person person= new Person();

        System.out.println(person.name);

        Baby baby= new Baby();

        System.out.println(baby.name);

        baby.name="Zahir";

        System.out.println(baby.name);


    }
}