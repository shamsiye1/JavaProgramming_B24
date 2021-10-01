package day30_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        String[] bankInfo= {"zilnaz", "12578966","$4589635288","checking account"};

        System.out.println("First account information "+Arrays.toString(bankInfo));


        String[] newAccountInfo= new String[4];
        newAccountInfo[0]= "asiye";
        newAccountInfo[1]= "45466622";
        newAccountInfo[2]= "$458222";
        newAccountInfo[3]= "debit";

        System.out.println("Second account information "+Arrays.toString(newAccountInfo));

        Scanner scan= new Scanner(System.in);
        System.out.println("How many information do you want to enter?");
        int size= scan.nextInt();
        String[] bankDetail= new String[size];
        for (int i=0; i< bankDetail.length; i++ ){

            System.out.println("Enter"+ (i+1)+"_account detail");
            bankDetail[i]= scan.next();

        }

        System.out.println("Third account information "+Arrays.toString(bankDetail));




















































    }
}
