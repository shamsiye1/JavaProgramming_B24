package day43_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfExample {
    public static void main(String[] args) {

        ArrayList<Integer> nums= new ArrayList<>(Arrays.asList(5,2,5,6,2,6,2,3,5,93,89,80,82,56,45));

        nums.removeIf(p -> p<5 || p>29);

        System.out.println(nums);
        nums.removeIf(p -> p%2 == 1);
        System.out.println(nums);










    }
}
