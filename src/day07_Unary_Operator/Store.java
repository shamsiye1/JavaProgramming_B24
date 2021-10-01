package day07_Unary_Operator;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Store {
    public static void main(String[] args) {
      String storeName= "Target";
      int numberOfTV= 100;
        System.out.println("Person came into the store and bought a tv");
        System.out.println("Number of tvs now: "+ --numberOfTV);

        System.out.println("Person came into the store and bought a tv");
        System.out.println("Number of tvs now: "+ --numberOfTV);

        System.out.println("Person came into the store and put a tv into the cart");
        System.out.println(" number of tvs in the store is still: "+ numberOfTV--);
        System.out.println("they buy everything and leave "+ numberOfTV);

        System.out.println("shipment of tvs comes");
        numberOfTV++;
        numberOfTV++;
        numberOfTV++;
        System.out.println("===============================");
        System.out.println(numberOfTV);

        numberOfTV= numberOfTV + 53;
        System.out.println(numberOfTV);
        System.out.println("someone with big bucks comes in and vuys 5 tvs");

        numberOfTV= numberOfTV- 5;

        System.out.println(numberOfTV);






























    }
}
