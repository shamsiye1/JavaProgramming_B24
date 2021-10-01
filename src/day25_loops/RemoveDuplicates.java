package day25_loops;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String s="aabdjfghhh";

        String unique="";

        for (int i=0; i< s.length(); i++){
            unique += s.charAt(i);

            if (unique.contains(unique)){
                System.out.println(unique);
            }else {
                System.out.println("no dublicate");
            }
        }

       // System.out.println(unique);

























































    }
}
