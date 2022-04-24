package Day37_ArrayList_BulkOperations_Predicate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BulkOperaions_Practice {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.addAll(Arrays.asList("A","B","C","D","E","F"));
        boolean verify = list.containsAll(Arrays.asList("B", "F"));
        System.out.println(verify);

ArrayList<Integer>list2=new ArrayList<>();
Integer in[]={10,20,30,40,50,65,14,22,65,985};
        list2.addAll(Arrays.asList(in));
       int max= Collections.max(list2);

       System.out.println(list2);
       System.out.println(max);

        System.out.println("==========================");
//remove method








    }
}
