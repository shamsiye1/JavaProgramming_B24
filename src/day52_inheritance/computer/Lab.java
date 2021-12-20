package day52_inheritance.computer;

public class Lab {
    public static void main(String[] args) {

        Windows computerOne= new Windows( 500);


        Windows computerTwo= new Windows(1000);

        System.out.println(computerTwo.os);
        System.out.println(computerTwo.memory);

        System.out.println(computerOne);

        Mac computerThree= new Mac(1000);
        Mac computerFour= new Mac(1500);

        System.out.println(computerFour);




    }
}
