package day54_abstraction.mobile;

public class Phone {
    public static void main(String[] args) {

     MobileApp app1= new MobileApp();

     app1.setName("Generic");
     app1.setVersion(0.11);
     app1.useApp(10);
     app1.download();
        System.out.println(app1);
        System.out.println("========================================");


     Instagram instagram= new Instagram();

     instagram.setName("instagram");
     instagram.setVersion(0.1289);
    instagram.useApp(11);
     instagram.download();
     System.out.println(instagram);
        System.out.println("-------------------------------------");
     Discord discord= new Discord();

     discord.setName("discord");
     discord.setVersion(1.2);
    discord.download();
     discord.useApp(20);






















    }
}
