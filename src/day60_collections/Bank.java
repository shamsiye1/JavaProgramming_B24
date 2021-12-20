package day60_collections;

public class Bank {
    /*Bank
     balance
       widthraw(double money)

            invalid cases:
            -> money >= balance  -> cause exception
            -> balance < 0       -> cause exception

            valid case:
                "Widthrawing " + money

        hint: throw new IllegalArguementException

     */
    double balance;

    public void withdraw(double money) {

        if (money > balance) {
            throw new NotEnoughMoneyException(); // unchecked exception
        } else if (balance <= 0) {
            throw new IllegalArgumentException(); // unchecked exception
        }

        System.out.println("Withdrawing $" + money);
        balance -= money;
    }


}





