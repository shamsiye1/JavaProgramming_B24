package day29_array;

public class MaxNumber {
    public static void main(String[] args) {

        int[] numbers= {-3,11,77,5,400,-200};
                      // 0 1   2 3  4  5
        int max=Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        if (numbers[0]> max ){
            max= numbers[0];

        }

        if (numbers[1]>max  ){
            max= numbers[1];

        }

        if (numbers[2]>max){
            max= numbers[2];

        }

        if (numbers[3]>max ){
            max= numbers[3];

        }

        if (numbers[4]>max){
            max= numbers[4];

        }

        if (numbers[5]>max ){
            max= numbers[5];

        }
        System.out.println(max);








































    }
}
