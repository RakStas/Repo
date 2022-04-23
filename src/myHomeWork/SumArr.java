package myHomeWork;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumArr {
    public static void main(String[] args) {


        int arr[] = {5, 8, 7, 98, -98,54,69,66,2};
        int result = 0;
        int count=0;
        for (int each : arr) {
        result+=each;
        count++;
        }
        result=result/count;
        System.out.println(result);
        System.out.println("+++++++++++++++");
        //Task3
       /* int [][]a = new int[10][10];
        for(int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%2d ", a[i][j]);
            }
            System.out.println();
        }
        System.out.printf("df ");*/
        //task 5;
        int value = 5;
        for (int each:arr){
            if (each==value){
                System.out.println("In you arr is num "+value);
            }

        }
    //6. Write a Java program to find the index of an array element.

        System.out.println("Write a Java program to find the index of an array element.");
            int myArray[] = {
                    5, 2, 54, 65, 4, 45, 21, 68, 87
            };

            Scanner s = new Scanner (System.in);
            System.out.println(" Which item in the array would you like to display?" );
            int select = s.nextInt();

            if (select <= myArray.length) {
                int n = 0;
                n = Array.getInt(myArray, select);
                System.out.print("The number in position " + select + " is: " + n );
            }
        System.out.println(Arrays.toString(arr));












    }
}