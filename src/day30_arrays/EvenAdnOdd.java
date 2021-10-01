package day30_arrays;

import java.util.Arrays;

public class EvenAdnOdd {
    public static void main(String[] args) {

      int[] numbers= {11,55,20,3,22,45,77,41,78,86,96,77,12};

      int even=0;
      int odd=0;

      String evenNumbers="";
      String oddNumbers= "";

      for (int i=0; i < numbers.length; i++){

          if (numbers[i]%2==0){
              even++;
              evenNumbers +=numbers[i]+" ";
             // System.out.print("even number "+ numbers[i] );
          }else {
              odd++;
              oddNumbers +=numbers[i]+ " ";
//              System.out.println("odd number "+ numbers[i]);
          }
      }

        System.out.println(Arrays.toString(numbers));
        System.out.println("Even number: "+ evenNumbers);
        System.out.println("Odd number: "+ oddNumbers);

















































    }
}
