package day29_array;

import java.util.Arrays;
import java.util.Scanner;

public class information {
    public static void main(String[] args) {

        String[] studentOne= {"1072254", "nazakat", "batur", "24th"};

        String[] studentTwo= new String[4];

        studentTwo[0]="12356";
        studentTwo[1]="asiye";
        studentTwo[2]="turghun";
        studentTwo[3]="24th";

        System.out.println(Arrays.toString(studentOne));
        System.out.println(Arrays.toString(studentTwo));

        Scanner scan= new Scanner(System.in);

        String[] studentThree= new String[4];

        System.out.println("Enter your id");
        studentThree[0]= scan.next();

        System.out.println("Enter your first name");
        studentThree[1]= scan.next();

        System.out.println("Enter your last name");
        studentThree[2]= scan.next();

        System.out.println("Enter your bath number");
        studentThree[3]= scan.next();

        System.out.println(Arrays.toString(studentThree));














































    }
}
