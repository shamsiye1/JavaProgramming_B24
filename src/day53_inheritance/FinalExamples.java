package day53_inheritance;

public class FinalExamples {

    final int a;
    public static final String PLANET="Earth"; // it can be accessible anytime anywhere
                             // USE capital means final
    public FinalExamples(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        FinalExamples obj= new FinalExamples(5);
        System.out.println(obj.a);

      //  obj.a=10;  a  is final so we cannot change/reassign the value

       // PLANET="Mars";  cannot reassign to final variables

    }

}
