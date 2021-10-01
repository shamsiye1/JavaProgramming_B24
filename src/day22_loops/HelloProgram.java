package day22_loops;

import java.util.Scanner;

public class HelloProgram {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        boolean continueTalking = true;
        while (continueTalking){
            System.out.println("Enter your message");
            String msg= input.nextLine();
            if (msg.equalsIgnoreCase("Hello")){
                System.out.println("Hi");
            }else if (msg.equalsIgnoreCase("bye")){
                System.out.println("okay bye ");
               // System.exit(0);
           continueTalking= false;

            }
        }





















































    }
}
