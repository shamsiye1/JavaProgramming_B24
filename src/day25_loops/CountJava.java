package day25_loops;

public class CountJava {
    public static void main(String[] args) {


        String s= "java is a language. java can be sued for alot java. java is complicated javascript";
        int counter=0;

        for (int i =0; i< s.length()-3; i++){  //  i <== s.length()-4

            String compareWords= "java";

            if (s.substring(i,i+4).equals("java")){

                counter++;
            }


// how difference with s.substring(i,i+4)=="java"  and s.substring(i,i+4).equals("java")


        }
        System.out.println(counter);





































































    }
}
