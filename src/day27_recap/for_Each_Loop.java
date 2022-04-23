package day27_recap;

import java.util.Arrays;

public class for_Each_Loop {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        for (int i = 0; i<=arr.length-1; i++){
        System.out.print(arr[i]+" ");
        }
        System.out.println();

        for (int each: arr){
            System.out.print(each+" ");
            }
        System.out.println();
        for (int j = arr.length-1; j>=0; j--){
            System.out.print(arr[j]+" ");
        }
        String [] names = {"A", "AC", "Abc", "C"};
        for (String each:names) {

            if (!each.contains("C")){
                continue;
            }
            System.out.println(each+" ");
        }
        System.out.println("==================");
        int num []={250,45,98,55,22,6954,478};
    //    Arrays.sort(num);
      //  System.out.println(Arrays.toString(num));
        int  max = num [0];
        int min = num [0];
        for (int each: num){
            if (each>max){
                max=each;

            }
            if (each<min){
                min=each;

            }
        }
        System.out.println(max);
        System.out.println(min);














    }
}
