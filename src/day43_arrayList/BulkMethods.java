package day43_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkMethods {
    public static void main(String[] args) {

        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(5);

        nums.addAll(Arrays.asList(3,5,1,2,5));

         ArrayList<Integer> other= new ArrayList<>(Arrays.asList(10,20));

//         nums.add(other.get(0));
//        nums.add(other.get(1));

        nums.addAll(0,other);// puts all the values of the other arrayslist starting from 0 index;

        System.out.println(nums);
        System.out.println(other);

        nums.remove(5);

        System.out.println(nums);

        nums.removeAll(Arrays.asList(2));
        nums.removeAll(Arrays.asList(5,10,3));

        System.out.println(nums);

        System.out.println(nums.removeAll(Arrays.asList(30)));
























    }
}
