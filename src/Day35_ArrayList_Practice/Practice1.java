package Day35_ArrayList_Practice;
import Library.Util;
/*Warmup tasks:
        1. write a program that can print the list of integers in reversed order
        ex:
        list=> {1,2,3,4,5}
        output: 5 4 3 2 1

        2. write a program that can return the sum of all the digits from a string
        ex:
        input: "a1b2c3"
        output: 6
        (1+2+3= 6)

        input: "Today's date is 04/27/2020"
        output: 17
        (0+4+2+7+2+0+2+0=17)

        HINT: on ascii table, the characters between #48 ~ #57 are digits

        3. write a program that can combine two String arrays into one arrayList
        ex:
        arr1 = {"A", "B", "C"};
        arr2 = {"D", "E", "F", "G"};

        list ==> {"A", "B", "C", "D", "E", "F", "G"}*/

import javax.xml.soap.SAAJResult;
import java.util.ArrayList;
import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println("Task #1");
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for (int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Task #3");
        String [] line={"A", "B", "C"};
        String [] line1={"D","E", "F" };
        String totalyLine[] =Util.TwoArraysInOneArr(line, line1);
        ArrayList<String >arr2= new ArrayList<String>(Arrays.asList(totalyLine));
        System.out.println("ArrayList is "+arr2);


        }


    }

