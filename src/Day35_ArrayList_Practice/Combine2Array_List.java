package Day35_ArrayList_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Combine2Array_List {
    public static void main(String[] args) {
        String arr1[]={"A", "B", "C"};
        String arr2[]={"D", "E", "F", "G"};

        ArrayList<String>list1=new ArrayList<>();
            //ArrayList<String>str1=new ArrayList<String>(Arrays.asList(arr1));
            //ArrayList<String>str2=new ArrayList<String>(Arrays.asList(arr2));
       for (String each:arr1){
           list1.add(each);
       }
        for (String each:arr2){
            list1.add(each);
        }
        System.out.println(list1);
    }
}
