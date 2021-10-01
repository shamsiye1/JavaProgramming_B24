package day38_methods;

public class ArrayAsParameter {

    public static void main(String[] args) {

        int[] a={1,2,3,4,5,7};
        printArray(a );
        printArrays(1,2,35,8);




    }




    public static void printArray(int[] arr){  // int ... arr <==>  int[] arr

        for (int each: arr){
            System.out.println(each);
        }

    }

    public  static void printArrays(int ... arr){
        for (int each: arr){
            System.out.println(each);
        }
    }


    public static void printArray(String ... arr){
        for (String each: arr){
            System.out.println(each);
        }
    }

    public static void printArray(String element, String ... arr){

        System.out.println(" var arg is used be careful");
    }





}
