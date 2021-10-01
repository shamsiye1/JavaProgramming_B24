package day40_ArrayList;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {

        ArrayList<String> groupOne= new ArrayList<>();
        System.out.println(groupOne);

        System.out.println(groupOne.size());// how many elements is there

        groupOne.add("nazakat");
        groupOne.add("asiye");
        groupOne.add("aliye");
        groupOne.add("mubarak");
        groupOne.add("maryam");
        System.out.println(groupOne);

        System.out.println("First element: "+ groupOne.get(0));
        System.out.println("First element: "+ groupOne.get(1));
        System.out.println("First element: "+ groupOne.get(2));
        System.out.println("First element: "+ groupOne.get(3));

        ArrayList<String>groupTwo= new ArrayList<>(20);
        System.out.println(groupTwo.size());

        System.out.println();

        ArrayList<String>groupThree= new ArrayList<>();
        groupThree.add("Nisso");
        groupThree.add(0,"Omer");
        groupThree.add("kamila");
        groupThree.add(0,"bogdan");
        groupThree.add(1,"james");
        groupThree.add("james");
        System.out.println(groupThree);




    }
}
