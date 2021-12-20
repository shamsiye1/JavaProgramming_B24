package day52_inheritance.person;

import java.util.ArrayList;
import java.util.Arrays;

public class Tester extends Employee {

    public static void main(String[] args) {

        Tester tester = new Tester();
        tester.name = "nadiye";
        tester.jobTitle = "SDET";
        tester.age = 0;
        tester.birthYear = 2021;
        tester.hobbies = new ArrayList<>(Arrays.asList("watch movie", "eating ice cream"));

        tester.walk();
        tester.work();

        System.out.println(tester);

    }
}
