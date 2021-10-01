package day41_arrayList;

import java.util.ArrayList;

public class RemoveByObject {
    public static void main(String[] args) {

        ArrayList<Integer> nums= new ArrayList<>();

        nums.add(99);
        nums.add(500);
        nums.add(700);
        nums.add(900);
        nums.add(520);

        nums.remove(0);

        // approach 1 by making the object first
        Integer a =700;
        nums.remove(a);

        //approach 2 by making the object in the remove method

    //    nums.remove(900);     <===  we can not to like this

        nums.remove(new Integer(900));
        System.out.println(nums);

        nums.clear();
        nums.add(800);
        System.out.println(nums);

        System.out.println(nums.isEmpty());  // checks if there is no elements









































    }
}
