package day45_constructors;

public class UsingAPP {
    public static void main(String[] args) {
      // created the object
        App firstApp= new App();

      // assign value to variables

      firstApp.name="google";
      firstApp.version=3.5;
      firstApp.isFree=true;

      firstApp.updated();

        System.out.println(firstApp); // this line is trying to print out object

        System.out.println("App information");
        System.out.println("Name: "+firstApp.name);
        System.out.println("Version: "+firstApp.version);
        System.out.println(firstApp.isFree? "App is free": "App cost some money");
        System.out.println("===============================");

        System.out.println("App information");
        System.out.println("Name: "+firstApp.name);
        System.out.println("Version: "+firstApp.version);
        System.out.println(firstApp.isFree? "App is free": "App cost some money");
































    }

}
