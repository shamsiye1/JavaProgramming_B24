package day09_Scanner_logical;

public class Review_scanner_logical {
    public static void main(String[] args) {

        double budget =1000;
        budget-= 200;
        boolean stillInBudget= budget >=0;
        System.out.println("still in budget: "+ stillInBudget);

        budget-= 500;
        System.out.println("budget after purchase: "+ budget);
        System.out.println("still in budget: "+ stillInBudget);

        System.out.println(budget !=300);
        System.out.println(budget != 300.5);

        System.out.println(budget-- ==300);
        System.out.println(--budget ==299);

        System.out.println(budget++ == 299);
        System.out.println(budget==299);

        int i= 5;
        boolean b= (i = 3)  ==5;
        System.out.println(b);
        System.out.println(false== !true);
        System.out.println(false !=true);













































    }
}
