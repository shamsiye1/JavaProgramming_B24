package day27_NestedLoops;

public class NestedLoopWithContinue {
    public static void main(String[] args) {
        for (int i=1; i <= 3; i++){
            System.out.println("first");

            for (int j=1; j <=3; j++){
                if (j ==2 ){
                  continue;
                }
                System.out.println("second"+j);

            }
        }


























    }
}
