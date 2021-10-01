package day32_array;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        // what is anagram?
        // 2 words are anagram if they are built up of the same character

        // abc
        // bca

        String wordOne= "listen";
        String wordTwo="silent";
        // convert two Strings to char arrays, to be able to compare each character

        char[] oneArr= wordOne.toCharArray();
        char[] twoArr= wordTwo.toCharArray();

        System.out.println(Arrays.toString(oneArr));
        System.out.println(Arrays.toString(twoArr));

        // sort the characters in order

        Arrays.sort(oneArr);
        Arrays.sort(twoArr);

        System.out.println("Is anagram "+ Arrays.equals(oneArr,twoArr));









































    }
}
