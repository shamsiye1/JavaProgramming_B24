package day35_methods;

public class ArrayMethods {

    /*

    make a method that accepts the array. find and print the first element.
    make a method that accepts the array. find and print the last element.
    make a method that accepts the array. find and print the middle element

    */

    public static void main(String[] args) {


        int[] nums={1,5,6,9,8,2,5,6};

        getFirstArrayElement(nums);
        getLastElement(nums);
        getMiddleElement(nums);

    }



    public static void getFirstArrayElement(int[] nums) {
        System.out.println("The first elements is: "+nums[0]);
    }

    public static void getLastElement(int[] nums) {
        System.out.println("The last elements is: "+nums[nums.length - 1]);
    }

    public static void getMiddleElement(int[] nums) {

        if (nums.length% 2==1){
            // odd length
            System.out.println("Middle element: "+ nums[nums.length/2]);

        }else {
            // even length
            System.out.println("First middle element: "+ nums[nums.length/2-1]);
            System.out.println("Second middle element: "+ nums[nums.length/2]);
        }


    }


}
