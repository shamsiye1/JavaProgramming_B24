package day18_string;

public class day18_stringMethods {
    public static void main(String[] args) {

        String s = "   Apples    are   ";
        System.out.println(s.trim());

        String s2 = "         ";
        System.out.println(s2.trim());  //  removes all the spaces

        String s3 = "";
        System.out.println(s3.trim());
        System.out.println(s3.isEmpty());
        System.out.println(s2.isEmpty());
        System.out.println(s.isEmpty());

        String s5 = "javascript";

        System.out.println(s5.startsWith("java"));
        System.out.println(s5.startsWith("Java"));

        String s6=" jump";

        System.out.println(s6.startsWith("j"));
        System.out.println(s6.startsWith(" j"));

        String s7 ="marker ";
        System.out.println(s7.endsWith("rke"));
        System.out.println(s7.endsWith("rker"));  // space is matter when string has space

        System.out.println(s7.endsWith("marker"));
        System.out.println(s7.startsWith("marker"));




    }
}
