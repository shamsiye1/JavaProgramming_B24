package day56_polymorphism.transportation;

public class Road {
    public static void main(String[] args) {
 //     reference type same with  object type
        Transportation obj1= new Transportation();
        obj1.go();


        Car obj2= new Car();
        obj2.go();
        obj2.openTrunk();
        System.out.println();

        Transportation obj3 = new Car();
        obj3.go();

      //  obj3.openTrunk(); // reference is not match

        Tesla t1= new Tesla();  // itself

        Car t2= new Tesla();   // super

        Transportation t3= new Transportation();  // super

        SelfDrivable t4 = new Tesla();  // interface

        Electric t5= new Tesla(); // interface

        t5.charge();
   //   t5.go();

        











    }



}
