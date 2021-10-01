package day09_Scanner_logical;

public class EligibleToVote {
    public static void main(String[] args) {
        String name= "zilnaz";
        boolean isUsCitizen= true;
        int age=30;
        boolean hasCriminalBackground= false;
        boolean isEligible= isUsCitizen && age>=18 && !hasCriminalBackground;

        System.out.println(isEligible);
        if( isEligible){
            System.out.println( name+" is eligible to vote");
        }else{
            System.out.println(name+" is not eligible to vote");
        }













































    }
}
