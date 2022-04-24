package Day37_ArrayList_BulkOperations_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,6,5,5,88,9,8,55,77));

         //maximum numbers
        Integer max=Collections.max(list);

        //minimum numbers
        Integer min =Collections.min(list);

        //Collections.replaceAll(ColectionType, old, value, new value):
        // replaces the old value with new given value
        ArrayList<String>list1=new ArrayList<>();
        list1.addAll(Arrays.asList("Stas", "Alina", "Lucky", "Sun", "Valeriy"));
        System.out.println("Old version: "+list1);
        Collections.replaceAll(list1, "Sun", "Cloud");
        System.out.println("New version: "+list1);




    }
}
