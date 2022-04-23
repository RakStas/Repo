package myHomeWork;

import java.util.Arrays;

public class DoubleArrInOne {
    public static void main(String[] args) {
        double arr [] = {1,2,3,4,5};
        double arr2[] = {6,7,8,9,10};
        double result []=new double [arr.length+ arr2.length];
        int count =0;
        for (double each: arr){
            result[count]=each;
            count++;
        }
        for (double each: arr2){
            result[count]=each;
            count++;
        }
        System.out.println(Arrays.toString(result));
    }
}
