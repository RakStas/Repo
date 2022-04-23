package Day33_Wrapper_Class_ArrayList_Intro;

import java.util.ArrayList;

public class List_Practice3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
            list.add(10);
        list.add(100);
        list.add(1000);
        list.add(100000);
        list.add(10000);
        list.add(7710);
        int max= Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (Integer each:list){
            if (each>max){
                max=each ;
            }
            if (each<min){
                min=each ;
            }

        }
        System.out.println(max);
        System.out.println(min);



    }
}
