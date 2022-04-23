package myHomeWork;
import  java.util.Arrays;
import java.util.Scanner;

public class FromSmollerToBigger {
    public static void main(String[] args) {
        int arr1[]={1,5,7,8,9,-9};
        int arr2=arr1[0];
        for(int each:arr1){
            if(arr2<=each){
                arr2=each;
            }
        }
        System.out.println(arr2);

    }
}