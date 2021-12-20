package day51_inheritance;

public class WorkPlace {
    public static void main(String[] args) {

        Employee obj1= new Employee();
        obj1.name="zilnaz";

        Tester obj2= new Tester();
        obj2.name="nazakat";
        Tester obj4= new Tester();
        obj4.name="muradil";

        Developer obj3= new Developer();
        obj3.name="nadiye";

        obj1.work();
        obj2.work();
        obj3.work();
        obj4.work1();







    }
}
