package day60_collections;

public class NotEnoughMoneyException extends RuntimeException {

    public NotEnoughMoneyException(){

        super("Your balance is either negative or zero");


    }


}
