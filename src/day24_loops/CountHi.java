package day24_loops;

public class CountHi {
    public static void main(String[] args) {

        String s= "aaaajiaaahiaaahiaa";
        int counter=0;



        for (int i= 0; i< s.length(); i++){

           if(s.charAt(i)== 'h' && s.charAt(i+1)=='i') {
               counter++;
           }
            System.out.println("Hi counter: "+ counter);


        }















































    }
}
