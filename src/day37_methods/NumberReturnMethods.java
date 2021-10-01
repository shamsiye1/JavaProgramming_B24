package day37_methods;

public class NumberReturnMethods {

//    Create a method that will accept a number parameter. We want to return a number as a word in String format
//
//    method(1) -> one
//    method(10) -> ten
//
//        return type: String
//    method name: convertNumberToWord
//    parameter: int

    public static void main(String[] args) {
        System.out.println(convertNumberToWord(11));
        System.out.println(convertNumberToWord(7));

    }

    public static String convertNumberToWord(int num){


        String[] words={"One","two","three","four","five","six","seven","eight","nine","ten"};
        if(num<=0 || num>10){
           return "Out of range";

        }
        return words[num-1];
    }



    public static int method(){
        for (int i=0; i<5; i++){

            if (i==2){
                return 0;
            }
            System.out.println(i);
        }
        return -1;
    }


























}
