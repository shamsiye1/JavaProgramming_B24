package day38_methods;

import java.util.Arrays;

public class ArraySum {

    public static void main(String[] args) {

        int[] arr= {3,5,1,5};
        System.out.println(sumOfElements(arr));

        int[] a={1,2,3};

        System.out.println(Arrays.toString(addElement(a,5)));




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


}
