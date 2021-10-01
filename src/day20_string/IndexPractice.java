package day20_string;

public class IndexPractice {
    public static void main(String[] args) {

        String word = "banana";

        int firstA = word.indexOf('a');

        int lastA = word.lastIndexOf('a');

        int middleA = word.indexOf('a', firstA + 1);

        System.out.println(firstA);
        System.out.println(lastA);
        System.out.println(middleA);
        System.out.println("==================================");


        String s = "00010110";

        int posOne = s.indexOf('1');
        int posTwo = s.indexOf('1', posOne + 1);
        int posThree = s.indexOf('1', posTwo + 1);
        int posFour = s.indexOf('1', posThree + 1);

        System.out.println(posOne);
        System.out.println(posTwo);
        System.out.println(posThree);
        System.out.println(posFour);


    }
}
