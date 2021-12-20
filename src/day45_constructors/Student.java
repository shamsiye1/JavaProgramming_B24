package day45_constructors;

public class Student {

    String name;
    int batchNumber;
    double grade;

   public String toString(){

       String s="Student Information: \n";
       s+="Name: "+name;
       s +="\nBatch: "+ batchNumber;
       s +="\nGrade: "+grade;

       return  s;
   }




}
