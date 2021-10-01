package day21_Loops;

public class Numbers {
    public static void main(String[] args) {
 // go from 1-100 and print only even numbers

 int number=1;

 while (number++<=100){
     if (number%2==0){
         System.out.print(number +" ");
     }
     //number++;  ===> this expression also work for loop, and even we can add increement above.

 }
        System.out.println();
       int oddNum=0;
    for (int i=0; i<100; i++){
        if (oddNum%2 !=0){
            System.out.println("odd number: "+ oddNum);
        }

    }
int numb=1;
    for(int i=0; i<100; i++){
        if (i % 2 ==1){
            System.out.print("odd number: "+i);
        }
    }






































    }
}
