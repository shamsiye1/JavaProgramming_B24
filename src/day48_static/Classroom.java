package day48_static;

import java.util.Arrays;

public class Classroom {
    public static void main(String[] args) {

        System.out.println("Batch: "+CydeoStudents.batchNumber);

        CydeoStudents studentOne=new CydeoStudents("James Bond",7,7);
        System.out.println(studentOne);

        CydeoStudents studentTwo= new CydeoStudents("sherlock holmes",10,8);

        System.out.println(studentTwo);

        System.out.println(studentOne.name + " and "+studentTwo.name+" have the following instructors: "+ Arrays.toString(CydeoStudents.instructors));

        // check how much coffee all cydeo students have
        //                 class name
        System.out.println(CydeoStudents.myCoffee.amountLeft);

        studentOne.myCoffee.drink(2);

        System.out.println(CydeoStudents.myCoffee.amountLeft);

        studentTwo.myCoffee.drink(3);

        System.out.println(CydeoStudents.myCoffee.amountLeft);















    }
}
