package day52_inheritance.person;

import java.util.ArrayList;

public class Person {

    String name;
    int age;
    int birthYear;
    ArrayList<String> hobbies;

    public Person() {
  // for handle super keyword
    }

    public void walk() {
        System.out.println(name + " is walking");

    }

    public Person(String name, int age, int birthYear){

        this.name=name;
        this.age=age;
        this.birthYear=birthYear;
      hobbies= new ArrayList<>();

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthYear=" + birthYear +
                ", hobbies=" + hobbies +
                '}';
    }
}
