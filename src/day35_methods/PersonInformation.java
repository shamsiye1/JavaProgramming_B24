package day35_methods;

public class PersonInformation {
    /*
    building up email

    parameters: name (first and last ), domain

    buildEmail("nazakat batur", "gmail")
    output: james_bond@gmail.com

     */
    public static void main(String[] args) {

        buildEmail("nazakat batur", "gmail");
        buildEmail("asiye turghun","yahoo");
        buildEmail("mubarak","qq");
            login("alida","ok");


    }
    public  static void buildEmail(String name, String domain){

        name = name.replace(" ","_");

        System.out.println(name+ "@"+ domain+ ".com");

    }

       public  static void login(String userName, String passWord){

        if (userName.equals("jbond007")&& passWord.equals("4555nnmm")){
            System.out.println("Logged in");
        }else{
            System.out.println("Invalid Credentials");
        }


    }


}
