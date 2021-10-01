package my_Utilitiess;

public class intUtil {

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
