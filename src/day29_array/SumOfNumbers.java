package day29_array;

public class SumOfNumbers {
    public static void main(String[] args) {

     int[] numbers= {4,8,9,5,8};

     int sum=0;

        sum +=numbers[0];
        sum +=numbers[1];
        sum +=numbers[2];

        System.out.println(sum);


        for (int i=0; i< numbers.length; i++){

            sum += numbers[i];

        }
        System.out.println(sum);

        int[] numberTwo= {5,6,9,8,7,4,55};

        int sumWithLoop= 0;
        for (int i=0; i< numberTwo.length; i++){

            sumWithLoop += numberTwo[i];

        }
        System.out.println(sumWithLoop);

























































    }
}
