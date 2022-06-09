package Day37_ArrayList_BulkOperations_Predicate;

import Library.Util;

import java.util.ArrayList;
import java.util.Collections;

public class frequencyOfChar {
    public static void main(String[] args) {
        String str = "ABBCCCDDDDFFFFF";

        ArrayList<String>list =new ArrayList<>();
        for (String each:str.split("")){
            list.add(each);
        }
        String  nonDup= Util.removeDup(str);



        System.out.println(nonDup);
        for (String each:nonDup.split("")) {
            int count = Collections.frequency(list, each);
            System.out.print (each+count);
        }
//fghj



    }


}
