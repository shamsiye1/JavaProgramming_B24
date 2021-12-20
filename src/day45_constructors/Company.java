package day45_constructors;

import java.util.Arrays;

public class Company {
    public static void main(String[] args) {

   Employee one= new Employee("nazakat batur",7,"QA", 2_000_000);

        System.out.println(one);
        one.goToMeeting();

        Employee[] staff= new Employee[3];

        staff[0]=one;

        System.out.println(Arrays.toString(staff));

        staff[1]= new Employee("asiye turghun",8, "SDET", 1_290_000);

        staff[2]= new Employee("mubarak",5,"tester",2_000_000);

        System.out.println(Arrays.toString(staff));


























    }
}
