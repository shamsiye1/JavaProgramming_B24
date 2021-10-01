package day38_methods;

public class UniqueValue {

    public static void main(String[] args) {

        int[] nums={1,2,3,6,55,55,55,7,7,7,5};


    }


    public static void getUniqueElements(int[] nums, int countElement){

        for (int each: nums){

           int counter= frequencyOfElement(nums, each);

                if (counter==1){
                    System.out.println(each);
                }
            }

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





