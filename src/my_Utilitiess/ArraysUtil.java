package my_Utilitiess;

public class ArraysUtil {

    /*

    this method will accept an int array and return the min number from the array

     */

    public static int minNumber(int[] arr) {

        int min = Integer.MAX_VALUE;

        for (int each : arr) {
            if (each < min) {
                min = each;
            }

        }

        return min;
    }

    public static int maxNumber(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    public static boolean contains(int[] arr, int num) {

        for (int each : arr){
            if (each== num){

                return true;
            }
        }

        return false;
    }

    public static int sumOfElements(int[] arr){

        int sum=0;
        for (int each: arr){

            sum +=each;
        }
        return  sum;
    }

    public  static int[] addElement(int[] origin, int element){

        int[] newArr= new int[origin.length+1];

        for (int i=0; i<origin.length; i++){
            newArr[i]= origin[i];

        }
        newArr[newArr.length-1]=element;

        return newArr;

    }

    public static int[] addElement(int[] arr, int[] elementsToAdd){

        int[] newArr= new int[arr.length+elementsToAdd.length];
        int index=0;

        for (int each: arr){
            newArr[index++]= each;
        }
        for (int each: elementsToAdd){
            newArr[index++]=each;
        }
        return newArr;
    }



}
