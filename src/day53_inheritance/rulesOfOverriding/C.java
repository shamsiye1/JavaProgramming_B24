package day53_inheritance.rulesOfOverriding;

public class C extends A{

    // looking at access modifiers in overriding

    @Override
    public int getNum(){
        return 6;
    }


    // getNum method cannot change access modifier because it is public, and they can only be made more accessible in overriding

    @Override
    public String getName(){
        return "str";
    }

    // getName method can be changed to protected, or public access because they are more accessible. or can stay default(same).
}
