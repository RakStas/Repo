package Day36_ArrayListContinue;
import Library.Util;
import java.util.ArrayList;

public class WarmTask {
    public static void main(String[] args) {
        System.out.println("Warm task #1");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.set((list.size() - 1), 0);
        System.out.println(list);
        System.out.println();


        System.out.println("WarmTask #2");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        for (Integer each : list2) {
            if (list2.indexOf(each) % 2 == 0) {
                each = each * 2;
            } else {
                each = each * 3;
            }
            System.out.print(each + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("WarmTask #3");
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(1);
        list3.add(3);
        list3.add(4);
        list3.add(4);
       // System.out.println("Full list is " + list3);
        ArrayList<Integer> uniques = new ArrayList<>();
        for (Integer each1 :list3) {
            Integer element = each1;
            int count=0;
            for (Integer each: list3) {
            if(each==element){
                count++;
            }
            }
            if (count==1){
                uniques.add(element);
            }


        }
        System.out.print(uniques + " ");
    }
}
















