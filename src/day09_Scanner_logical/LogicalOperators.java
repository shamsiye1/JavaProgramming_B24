package day09_Scanner_logical;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

public class LogicalOperators {
    public static void main(String[] args) {

        // 3<i<40

        int a=3;
        int z= 40;
        int i =5;
boolean outPut= i>3 || i>40;

boolean outPut2= i<3 || i>40;


        System.out.println(outPut);
        System.out.println(outPut2);
        System.out.println("====================================================");
        int min=3;
        int max=40;
        System.out.println(i> min && i< max);
        System.out.println(i < min || i> max);
        System.out.println(true || (false && true));








    }
}
