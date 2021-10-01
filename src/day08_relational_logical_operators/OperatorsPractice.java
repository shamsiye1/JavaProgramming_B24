package day08_relational_logical_operators;

public class OperatorsPractice {
    public static void main(String[] args) {

       int w = 78/2*2 + 3-5%5;
        System.out.println("w: "+w);

        System.out.println();

        int a =8;
        int b= a--;  // b= 8;
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);

        System.out.println("===================");


        int c=1;
        int d= -c-- + c++/ -c-- * --c;
        //       -1+ 0 / -1 * -1
        System.out.println("c: "+c);

        System.out.println("d: "+ d);

        int  t =100;
        int p= - ++t * -t-- / t++ + --t;
        //      -101 * -101 / 100 + 100
     System.out.println("t: "+t);
     System.out.println(p);


     System.out.println("========================================");

     int r= 20;
     int W= -r-- + -r++ + --r * r-- %2;
     //     -20 + -19 + 19 * 19 %2
     System.out.println(r);
     System.out.println(W);

























    }
}
