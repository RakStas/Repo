package Day35_ArrayList_Practice;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        //set method
        ArrayList<String>arr=new ArrayList<>();
        arr.add("A"); //0
        arr.add("B");//1
        arr.add("C");//2
        arr.add("D");//3
        arr.add("E");//4
        arr.set(4, "G" );
        arr.set(0, "rr");
        System.out.println(arr);
        arr.clear();
        System.out.println(arr);


        System.out.println("============");
        //remove method (int index)
        ArrayList<Integer>num=new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.remove(2); //1,2,4,5   // size is 4
        System.out.println(num);
        System.out.println("================");

        //remove(Object)

        ArrayList<Integer>num1=new ArrayList<>();
        num1.add(1); //0
        num1.add(2); //1
        num1.add(3); //2
        num1.add(4); //3
        num1.add(5); //4

        Integer a=1;
        num1.remove(a);       // видаляє значення, а не індекс елемента
        System.out.println(num1);
        System.out.println("===================");

        ArrayList<String>num3=new ArrayList<>();
        num3.add("A"); //0
        num3.add("B"); //1
        num3.add("C"); //2
        num3.add("D"); //3
        num3.add("E"); //4
        num3.remove(2); //index
        num3.remove("D"); //object
        System.out.println(num3);
        



    }
}
