package Day36_ArrayListContinue;

import java.util.ArrayList;

public class Last_Index_Of_Arr_List_Equal_Null {
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
    }
}
