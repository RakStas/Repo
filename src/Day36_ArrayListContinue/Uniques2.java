package Day36_ArrayListContinue;

import java.util.ArrayList;
import java.util.Collections;

public class Uniques2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(4);
        ArrayList<Integer> uniques = new ArrayList<>();
        for (Integer each1 :list) {

            int count= Collections.frequency(list, each1);

            if (count==1){
                uniques.add(each1);
            }


        }
        System.out.print(uniques + " ");




    }
}
