package day21_Loops;

public class Email {
    public static void main(String[] args) {
        String email= "saim@cybertecschool.com";

        int posOfAt= email.indexOf("@");
      //  String mid= email.substring(2);
        String name = email.substring(0,posOfAt);
        String domain = email.substring(posOfAt+1);

        System.out.println(posOfAt);
        System.out.println("Name: "+ name);
        System.out.println("Domain: "+ domain);







    }
}
