package day12_if_Statement;

public class CheckNumberMultiIf {
    public static void main(String[] args) {

        int num1 = 79;
        int num2 = 79;
        int num3 = 79;

        int biggest = 0;
        if (num1 >= num2 && num1 >= num3) {
            biggest = num1;
        }else if (num2 >= num1 && num2 >= num3) {
            biggest = num2;
        }else if (num3 >= num1 && num3 >= num2) {
            biggest = num3;
        }


        System.out.println(biggest + " is greater");
























    }
}