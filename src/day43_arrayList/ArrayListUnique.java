package day43_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListUnique {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(3,1,55,2,22,5,5,5,6,1,555,5,56,7));
        System.out.println(getUniqueElements(list));


    }



                 //  return type        method name       parameters
    public static ArrayList<Integer> getUniqueElements(ArrayList<Integer> list){

        ArrayList<Integer> unique= new ArrayList<>();

        for (int each:  list){
           int count =Collections.frequency(list,each);

           if (count==1){
               // unique element
               unique.add(each);

           }


        }

        return unique;
    }



}
