package day10_scannerRecap;

import java.util.Scanner;

public class ChangeMachine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int userMoney, quarters, dimes, nickles, pennies;

        System.out.println("hello, welcome to the change machine");
        System.out.println("Enter a render number from 1-99");

        userMoney = scan.nextInt();    //  83

        quarters = userMoney/25;      // 83/25 ===>  whole 3  | left over= 83- 25*3  ==8;
        userMoney %= 25;   // 8

        dimes = userMoney/10;    // 8/10
        userMoney %= 10;//  8% 10 ====> 8

        nickles = userMoney/5;  // 8/5 ===> 1 | 8- ==>3
        userMoney%=5;  //3
        pennies = userMoney;


        System.out.println( "your change is: ");
        System.out.println("quarters: "+ quarters);
        System.out.println("dimes: "+ dimes);
        System.out.println("nickles: "+ nickles);
        System.out.println("pennies: "+ pennies);

        scan.close();


    }
}
