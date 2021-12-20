package day45_constructors;

public class UsingStudent {
    public static void main(String[] args) {

        Student studentOne= new Student();

        studentOne.name="nazakat batur";
        studentOne.batchNumber=24;
        studentOne.grade=99;

        System.out.println(studentOne.toString()); // we try to call toString , but we don't need to
        System.out.println("============================================");
        System.out.println(studentOne); // toString is still called automatically






















    }
}
