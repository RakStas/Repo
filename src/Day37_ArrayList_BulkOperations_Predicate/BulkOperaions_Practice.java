package Day37_ArrayList_BulkOperations_Predicate;


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
//remove method (delete all the matching elements)
        System.out.println("remove method");
        ArrayList<Integer>nums = new ArrayList<>();
        nums.addAll( Arrays.asList(1,1,2,2,3,3,4,5,5));
        nums.removeAll(Arrays.asList(1,3,5));
        System.out.println(nums);
        System.out.println();

//retainAll (delete all the NOT matching elements)
        System.out.println("retainAll");
        ArrayList<Integer>nums1 = new ArrayList<>();
        nums1.addAll( Arrays.asList(1,1,2,2,3,3,4,5,5));
        nums1.removeAll(Arrays.asList(4,2));
        System.out.println(nums1);
        System.out.println();

        System.out.println("=======================");
        System.out.println("remove name");
        System.out.println();
        System.out.println("Task 1");
        ArrayList<String> names =new ArrayList<>();
        names.addAll(Arrays.asList("Nadiya", "Oleksiy", "Lucky","Alinka", "Emilichka"));
        names.removeAll(Arrays.asList("Lucky"));
        System.out.println(names);


        System.out.println("=============");
        /*write a program that can remove the elements thta are not unique from the ArrayList

			NOTE:
				DO NOT USE:
						for loop
						while loop
						for each loop
						do-while


						list: {1,1,2,2,3,3,4,5,6,7}

						output: {4,5,6,7}*/
        System.out.println("Task 2");
        ArrayList<Integer>task2=new ArrayList<>();
        task2.addAll(Arrays.asList(1,1,2,2,3,3,4,5,6,7));











    }
}
