package day36_Methods;

public class CreditScore {
    public static void main(String[] args) {

        getCreditScore();
        System.out.println(getCreditScore());
        int score= getCreditScore();
        System.out.println(score);

        hasGoodCreditScore(900);
        System.out.println(hasGoodCreditScore(860));

        if(hasGoodCreditScore(600)){
            System.out.println("good score");
        }else {
            System.out.println("bad score");
        }



    }

public static int getCreditScore(){
        return 800;
    }

    public static boolean hasGoodCreditScore(int score){
        if (score>75){
            return true;
        }else {
            return false;
        }


    }





}
