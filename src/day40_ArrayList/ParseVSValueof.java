package day40_ArrayList;

public class ParseVSValueof {

    public static void main(String[] args) {

        String s = "30";
        System.out.println(s+5);
        //System.out.println(s < 60); don't work'

        int seconds = Integer.parseInt(s);
        // Convert the "30" string into the int value of 30
        System.out.println(seconds < 60);

    }

}
