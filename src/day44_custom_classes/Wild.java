package day44_custom_classes;

public class Wild {
    public static void main(String[] args) {

        Animal tiger= new Animal();


        tiger.species="Tiger";
       tiger.size="Medium";
        tiger.numberOfLegs=4;
        tiger.canFly=false;
        tiger.isMammal=true;
        tiger.weight=3.5;
        tiger.lifeSpan=15;

      // Animal.eat(); cannot call eat method from Animal class directly.
        tiger.eat(); // to call eat method, we have to use it from an object

        tiger.sleeping();



        new Animal().eat(); // if there have reference(variable) is more profitable

        Animal panda= new Animal();
        panda.eat();
        panda.species="Panda";
        panda.eat();





    }



}
