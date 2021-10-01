package day37_methods;

import java.util.Arrays;

public class quiz {
    public static void main(String[] args) {

//        char[] arr={'d','c','b','a'};
//        Arrays.sort(arr);
//        for(char each: arr){
//            System.out.println(each+" ");
//            if (each=='d'){
//                continue;
//            }
//        }

//
//int n=0;
//String[] days={"sun","mon","wed","sat"};
//for (int i=0; i< days.length; i++){
//    switch (days[i]){
//        case "sat":
//        case "sun":
//            n -=1;
//            break;
//        case "mon":
//            n++;
//        case "wed":
//            n +=2;
//    }
//}
//
//        System.out.println(n);
//
        int[] num1=new int[3];
        int[] num2= {1,2};
       // num1=num2;
        num2=num1;
        for (int i=0; i<num1.length; i++){
            System.out.print(num1[i]);
        }

        System.out.println(Arrays.toString(num2));
//
//int[] arr={15,30,45,60,75};
// arr[2]=arr[4];
// arr[4]=90;
//        System.out.println(Arrays.toString(arr));


//        int[] arr={1,2,3,4};
//        int i=0;
//        do {
//            System.out.println(arr[i]+" ");
//            i++;
//        }while (i< arr.length-1);















    }
}
