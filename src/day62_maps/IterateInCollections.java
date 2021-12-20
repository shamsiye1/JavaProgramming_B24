package day62_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IterateInCollections {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("james", "adam", "anna", "beth"));

        System.out.println(list);

        // this is like for each loop
        Iterator<String> it = list.iterator();

//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println();
        while (it.hasNext()) { // this while loop works same as above( print every code with next() method)
            String name = it.next();

            //  System.out.println(it.next());
            if (name.startsWith("a")) {
                it.remove();
            }

        }
        System.out.println(list);
    }


}
