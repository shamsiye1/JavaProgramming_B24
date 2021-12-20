package day53_inheritance.rulesOfOverriding;

public class B extends A{

    // cannot change the signature -  name ore parameters
    @Override
    public int getNum(){
        return 5;
    }

}
