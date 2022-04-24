package Day37_ArrayList_BulkOperations_Predicate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperaions_Practice {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.addAll(Arrays.asList("A","B","C","D","E","F"));
        boolean verify = list.containsAll(Arrays.asList("B", "F"));
        System.out.println(verify);




    }
}
