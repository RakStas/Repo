package Day37_ArrayList_BulkOperations_Predicate;

import java.util.ArrayList;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {
        String str="ABBACDuujkioDF";
        // method to using for loop
       /* String result = "";

        for (int j=0; j<=str.length()-1; j++){
            char ch = str.charAt(j);
            int count =0;
        for (int i=0; i<=str.length()-1; i++){
            char each = str.charAt(i);
            if (each==ch){
                count+=1;
            }
        }
        if (count ==1){
            result+=ch;
        }
        }
        System.out.println(result);*/
        // another method with using ArrayList
        ArrayList <String>list=new ArrayList<>();
        for (String each:str.split("")){
            list.add(each);

        }
        for (String each:list) {
            int count = Collections.frequency(list, each);
            if (count==1) {
                System.out.print(each+" ");
            }
        }



    }
}
