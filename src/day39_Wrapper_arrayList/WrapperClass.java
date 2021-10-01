package day39_Wrapper_arrayList;

public class WrapperClass {
    public static void main(String[] args) {

        int a = 5;
        // you cannot use method from it:  a.method();
        // you can: print, assign/reassign, calculations, casting

        Integer i1 = new Integer(10);
        System.out.println(i1);
        Integer i2 = 11;   // this converts int primitive to integer wrapper class
        System.out.println(i2);

        byte b=4;
        Byte b2= new Byte((byte)5);
        Byte b3= (byte)500;
        System.out.println(b3);

        short s=100;
        Short s2=new Short((short)200);
        Short s3= 300;

        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);

        Long l=1000l;
        Long l2=new Long(2000l);
        Long l3= 3000l;

        Float f1= new Float(4.5F);
        Float f2=4.7f;









    }


}
