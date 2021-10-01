package day42_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListSorting {

    public static void main(String[] args) {

        // how did you sort arrays?
        // we used Arrays.sort()

        ArrayList<Integer> nums= new ArrayList<>(Arrays.asList(4,5,50,502,150,-40,-10));

        Collections.sort(nums);
        System.out.println(nums);














    }
}
