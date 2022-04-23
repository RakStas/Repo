package Day36_ArrayListContinue;

import java.util.ArrayList;

/*ArrayList methods:
	indexOf()
	lastIndexOf()
	contains()
	equals ()
	isEmpty()*/
public class Arr_List_Methods {
    public static void main(String[] args) {
       //indexOf()
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int a=list.indexOf(3);
        System.out.println(a);
       //contains()
        boolean r1= list.contains(100); //r1=false

        System.out.println("==========================");
        ArrayList<String> list1=new ArrayList<>();
        list1.add("Cybertek");
        ArrayList<String> list2=new ArrayList<>();
        list1.add("Cybertek");


            //equals ()    // boolean=true/false
        System.out.println(list1.equals(list2)); //true

        //isEmpty ()    / for all data type
        ArrayList<String> list3=new ArrayList<>();
        boolean isEmp=list3.isEmpty(); //true
        System.out.println( isEmp );











    }
}
