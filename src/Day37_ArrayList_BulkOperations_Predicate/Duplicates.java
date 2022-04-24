package Day37_ArrayList_BulkOperations_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class Duplicates {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,2,3,3,3,4,5,6,7,7));

        list.removeIf(p-> Collections.frequency(list,p)==0);
        System.out.println(list);

        System.out.println("=========================");
        ArrayList<String>names=new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Canada", "Bob", "Lucky"));
        names.removeIf(p->p.toLowerCase(Locale.ROOT).charAt(0)!=p.charAt(p.length()-1));
        System.out.println(names);
        System.out.println("==============================");























    }
}
