package day27_NestedLoops;

public class UniqueCharacter {
    public static void main(String[] args) {

        String str= "apple";


        for (int i=0; i < str.length(); i++){
            int count=0;  //resets count to 0 everytime the outer loop runs

            for (int j=0; j< str.length(); j++){

                if (str.charAt(i)== str.charAt(j)){
                   count++;
                }

            }

            if (count==1){
                System.out.print(str.charAt(i));
            }

        }
//        System.out.println();
//        System.out.println(count);
























    }
}
