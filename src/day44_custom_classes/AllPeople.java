package day44_custom_classes;

public class AllPeople {

    public static void main(String[] args) {

        // make Person object;
   Person personOne= new Person();   //  <=== made personOne object;
   personOne.name="nazakat";

   // age =40;   we cannot directly assinged the age because age is not local variable.

   personOne.age= 30;
   personOne.hairColor="dark blue";
   personOne.gender='F';
   personOne.isMarried= true;

   // this will not print us anything useful, for now
        System.out.println(personOne);

        System.out.println("===========================");

    // how to print each field?
    // in order to access each instance variable we need to use the reference
        System.out.println("Name: "+personOne.name);
        System.out.println("Age: "+personOne.age);
        System.out.println("Hair color: "+ personOne.hairColor);
        System.out.println("Sex: "+personOne.gender);
        System.out.println("Married: "+ (personOne.isMarried?"yes":"no"));


        //  System.out.println(Person.name);  name cannot be accessed because it is not being used with an object







    }


}
