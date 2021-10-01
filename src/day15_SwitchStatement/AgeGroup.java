package day15_SwitchStatement;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
//        infant (< 1 year)
//        Toddler (2 - 5)
//        Kid (6 - 9
//                Pre-Teen (10 - 12)
//                Teenager (13 - 17)
//                Young Adult (18 - 20)
//                Adult (21 - 35)
//                Middle-Aged Adult (36 - 55)
//                Senior Citizen (55+)


        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your age");
        int age= scan.nextInt();

        String result= "you should be a "+"";
//        int age=525;
     if (age>=0 && age<= 120){
         if (age<= 1){
           result="Infant group";
         }else if (age>=2 && age<=5){  // because this is else if statement so we also can express the condition like  ====>  age<= 5;
             result+= "Toddler group";
         }else if (age>=6 && age<=9){   // age <=9
             result= "Kids group";
         }else if (age>=10 && age<=12){  // age <=12
             result+= "Pre-Teen group";
         }else if (age>=13 && age<=17){   // age <17
             result+= "Teenager grooup";
         }else if (age>=18 && age<=20){    // age<= 20
             result+= "Young Adult";
         }else if (age>=21 && age<=35){   // age<= 35
             result+= "Adult group";
         }else if (age>=36 && age<= 55){   // age<=55
             result+= "Middle- Aged Adult";
         }else {
             result+= "Senior Citizen";
         }
     }else {
         System.out.println("Invalid age");
     }
        System.out.println(result);
















    }
}
