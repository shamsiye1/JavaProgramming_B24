package day18_string;

import java.util.Scanner;

public class Websites {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("type a website");
        String name= scan.nextLine();
        String valid;
        if (name.startsWith("www.")){
            if (name.endsWith(".com") || name.endsWith(".edu") || name.endsWith(".gov") || name.endsWith("net")){
                System.out.println(name+ " is valid");
            }else {
                System.out.println(name+ " is invalid");
            }
        }

        if (!name.startsWith("www.")){
            System.out.println("needs to begin with www.");
        }else if (!name.endsWith(".com") || name.endsWith(".edu") || name.endsWith(".gov") || name.endsWith("net")){
            System.out.println("needs to end with: \n.com\n.edu\n.gov\nor\n.net");
        }








    }
}
