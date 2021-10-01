package day42_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CountLetters {

    public static String countEachLetter(String str) {

        // how do we convert String to ArrayList

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        String result = "";

        for (String each : list) {

            if (!result.contains(each)) {
                int count = Collections.frequency(list, each);

                result += each + count;
            }


        }

        return result;


    }


    public static void main(String[] args) {
        System.out.println(countEachLetter("aaaaabbcccdddddeefeef"));
    }

}
