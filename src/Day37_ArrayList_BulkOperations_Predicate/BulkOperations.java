package Day37_ArrayList_BulkOperations_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        //hard way
        ArrayList<Integer>list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        boolean b=list.contains(1); //true
        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(6);
        boolean bAll = list.containsAll(list2);
        System.out.println(bAll);

            //easier way to use ***.containsAll(**);

        ArrayList<Integer>list3 =new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list3.add(5);
        Integer in []={1,2,3,4};
         boolean bAll2=       list3.containsAll(  Arrays.asList(list)  );
        System.out.println(bAll2);
    }
}
