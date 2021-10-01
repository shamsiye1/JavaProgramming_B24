package day32_array;

import java.util.Arrays;

public class SortArrays {
    public static void main(String[] args) {

        int[] nums= {4,5,6,9,82,55,44,87,85,-74};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

       // Arrays.sort(nums, Collections.reverseOrder());

        // given an int array, find the max and min number

        System.out.println("Smallest number: "+ nums[0]);
        System.out.println("Biggest number: "+nums[nums.length-1]);

        nums[0] =19;

        System.out.println(Arrays.toString(nums));





























    }
}
