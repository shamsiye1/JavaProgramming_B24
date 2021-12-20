package day54_abstraction.person;

public class Tester extends Employee{   // Concrete class




    @Override
    public void work() {
        System.out.println("Run test cases");
    }

    @Override
    public void sleep(int minutes) {
        System.out.println("sleeping "+ minutes+"minutes while tests automatically");
    }
}
