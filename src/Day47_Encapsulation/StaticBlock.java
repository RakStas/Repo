package Day47_Encapsulation;

import java.util.ArrayList;


public class StaticBlock {
    static String companyName="PrivateBank";

    static ArrayList<Integer>list;

    static {
        list=new ArrayList<>();
        list.add(15);
        list.add(16);
    }

    public static void main(String[] args) {

        System.out.println(companyName);
        System.out.println(list.toString());


    }



}
