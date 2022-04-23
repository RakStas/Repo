package Day36_ArrayListContinue;
import java.util.ArrayList;

import java.util.Collections;

public class Collections_Utillity {
    /* Arrays: utility class for array
    collection: utility from collection ""import java.util.Collection;""
     */

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(60);
        list.add(50);
        list.add(30);
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Max is "+list.get(list.size()-1));
        System.out.println("Min is "+list.get(0));



    }


}
