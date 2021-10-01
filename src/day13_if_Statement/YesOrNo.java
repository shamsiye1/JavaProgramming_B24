package day13_if_Statement;

import java.util.Scanner;

public class YesOrNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("what is your first name");
        String firstName= scan.next();

        System.out.println("do you like soccer");
        String likeSoccer = scan.next();


        if (likeSoccer.equals("yes") || likeSoccer.equals("YES")){
            System.out.println("who is your favorate team");
            String team = scan.next();
            if (team.equals("basa")){
                System.out.println("oh i like "+ team+ " too");
            }else{
                System.out.println("the team you liked i never heard before");
            }


        }else if(likeSoccer.equals("no")) {
            System.out.println("thats okey");

        }else{
            System.out.println("you didn't answer the question");
        }












































    }
}
