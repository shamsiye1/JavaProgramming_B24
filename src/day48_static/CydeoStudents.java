package day48_static;

public class CydeoStudents {

    String name;
    int id;
    int groupNumber;

    static Coffee myCoffee;


    static int batchNumber;
    static String [] instructors;
    static String schoolName;

    public CydeoStudents(String name, int id, int groupNumber){
        this.name = name;
        this.id = id;
        this.groupNumber = groupNumber;
    }

    static {
        int s= 4;
        batchNumber =24;
        instructors=new String[]{"Nadir","Saim","Muradel"};
        schoolName ="Cydeo";

     //   this.id=id;     // we cannot use the id here bcz id is static variable

        myCoffee= new Coffee("starbucks",10);

    }


    @Override
    public String toString() {
        return "CydeoStudents{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
