package day49_encapsulation;

import java.util.Arrays;

import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Example2 {
    public static void main(String[] args) {

        int[] a = {3, 4, 1, 5, 1};

        sort(a);
        System.out.println(Arrays.toString(a));

        //System.out.println(Math.PI); // if we use static import we can use some specific static member without class. like below.
        System.out.println(PI); // MATH ==> is static

        System.out.println(cos(4.9));

    }
}
