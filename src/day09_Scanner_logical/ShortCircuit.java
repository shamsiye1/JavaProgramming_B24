package day09_Scanner_logical;

public class ShortCircuit {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(false && true);

        System.out.println(true || 5/0 ==0);

        int count=5;
        System.out.println(count++ ==5 && ++count==7);

//                                            8
        System.out.println(count++ !=5 || ++count==7);// if the left of the || is true, then the right side cannot be executed.

  //                        5             count= 10
        System.out.println(count);


        System.out.println(count++ ==5 | ++count==7);    //12

        System.out.println(count);


















    }
}
