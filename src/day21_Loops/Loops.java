package day21_Loops;

public class Loops {
    public static void main(String[] args) {

        System.out.println("Hello world");
//
//        for (int i=0; i>=0; i++){
//            System.out.println("Hello world");
//        }

//    while(true){
//        System.out.println("Hello world");
//    }         ======> this is called infant loop

        int number =0;
        while (number<=10){
            System.out.println("Hello world"+ number);
            number++;
        }

        System.out.println();

        int number2= 1;
        while (number2<=100){
            System.out.println("Hello universe "+ ++number2);
           // number2++;
        }
        System.out.println();

        int number3 =1;
        while (number3++ <=100){
            System.out.println("Hello everyone"+number3);
        }
        System.out.println(number3);



















































    }
}
