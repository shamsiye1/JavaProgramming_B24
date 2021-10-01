package day38_methods;

public class CountElements {

    /*

    create a method that accept an int array and a number

    count and return the number of times the given number is found in the array

    return type: int
    method name: frequencyOFElement
    parameters: int[] , int

    Ex: input:
         {1,2,5,1,4,1},  1
         output:
         3

     */


    public static void main(String[] args) {
        int[] ar={1,2,5,1,4,1};
        System.out.println(frequencyOfElement(ar, 1));
    }


    public static int frequencyOfElement(int[] arr , int countElement){

        int counter=0;
//
//        for (int each: arr){
//            if (each==countElement){
//                counter++;
//            }
//
//        }
      // System.out.println(countElement);

        for (int i=0; i< arr.length; i++){

            if (arr[i]== countElement){
                counter++;
            }
        }


        return counter;
    }



}
