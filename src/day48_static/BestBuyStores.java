package day48_static;

public class BestBuyStores {

    public static void main(String[] args) {

      BestBuy storeOne= new BestBuy("main st");

      BestBuy storeTwo=new BestBuy("Oak dr");

        System.out.println(storeOne.location);
        System.out.println(storeTwo.location);

        System.out.println(BestBuy.day);

        System.out.println(storeOne.day);
      //  System.out.println(BestBuy.location);  // cannot call location directly, because it is instance variable. but day is static variable so can call directly.

        // static belongs to class
        // instance belongs to object
//          can do the change like that, but static only eccept the last reference
//     storeOne.day="sunday";
//     storeTwo.day="monday";
//
//        System.out.println(BestBuy.day);
//        System.out.println(storeOne.day);
//        System.out.println(storeTwo.day);











    }






}
