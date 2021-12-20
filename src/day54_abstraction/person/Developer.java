package day54_abstraction.person;

public class Developer extends Employee { // Concrete class

    // Developer is a Employee
    // Developer is a Person      ====> it matching so it is a inheritance

    @Override
    public void work() {
        System.out.println("Developer is creating feature");
    }

    @Override
    public void sleep(int minutes) {
        System.out.println("Developer loosing sleep because of bug ");

    }
}
