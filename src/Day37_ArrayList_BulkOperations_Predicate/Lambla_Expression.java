package Day37_ArrayList_BulkOperations_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Lambla_Expression {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,2,3,4,4,5,6,7,8,9));

       // Predicate<Integer>numLess5=p->p<5;
        list.removeIf(p->p<5);
        System.out.println(list);


        ArrayList<Integer>list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,1,1,2,2,3,4,4,5,6,7,8,9));
        Predicate<Integer>oddNum=p->p %2!=0;  //OddNumbers
        list1.removeIf(oddNum);
        System.out.println(list1);
        ArrayList<Integer>list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,1,1,2,2,3,4,4,5,6,7,8,9));
        Predicate<Integer>evenNum=p->p %2==0;  //evenNumbers
        list2.removeIf(evenNum);
        System.out.println(list2);
        System.out.println("=======================");

        ArrayList<String>names=new ArrayList<>();
        names.addAll(Arrays.asList("Marina", "Margarita", "Marusiya", "Moldova", "Moroz", "Alina"));
        names.removeIf(  each->each.startsWith("M") &&each.endsWith("a") );
        System.out.println(names);

        System.out.println();
        System.out.println("==============");
        System.out.println();
        ArrayList <Integer >nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,2,2,3,4,5,6,6,7,7,8,9));
        nums.removeIf(p-> Collections.frequency(nums, p)!=1);
        System.out.println(nums);































    }
}
