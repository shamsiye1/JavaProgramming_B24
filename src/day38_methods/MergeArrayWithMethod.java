package day38_methods;

import my_Utilitiess.ArraysUtil;

import java.util.Arrays;

public class MergeArrayWithMethod {
    public static void main(String[] args) {



        int[] a={4,1,5};
        int[] b={10,20};

        System.out.println(Arrays.toString(ArraysUtil.addElement(a,b)));
        System.out.println(Arrays.toString(ArraysUtil.addElement(b,a)));

    }






}
