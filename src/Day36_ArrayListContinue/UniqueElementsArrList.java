package Day36_ArrayListContinue;

import java.util.ArrayList;

public class UniqueElementsArrList {
    public static void main(String[] args) {
        System.out.println("WarmTask #3");
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(1);
        list3.add(3);
        list3.add(4);
        list3.add(4);
        // System.out.println("Full list is " + list3);
        ArrayList<Integer> uniques = new ArrayList<>();
        for (Integer each1 : list3) {
            Integer element = each1;
            int count = 0;
            for (Integer each : list3) {
                if (each == element) {
                    count++;
                }
            }
            if (count == 1) {
                uniques.add(element);

            }
        }
    }}