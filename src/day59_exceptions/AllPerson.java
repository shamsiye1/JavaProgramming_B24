package day59_exceptions;

public class AllPerson {
    public static void main(String[] args) {

        Person obj = new Person();
        obj.setName("nadiye");

        try {
            obj.setAge(40);
        } catch (Exception e) {

        }

        System.out.println(obj.getName());
        System.out.println(obj.getAge());

        try {
            obj.setAge(-20);
        } catch (Exception e) {
            System.out.println("Invalid age");
        }


    }
}
