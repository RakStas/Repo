package Day29_Custom_Method;

import java.util.Arrays;

public class Unique_ {
    public static void main(String[] args) {
        String arr[] = {"A", "B", "C", "A", "B"};
        String str1 = arr[0];
       /* int k = 0;
        for (int j = 0; j <= arr.length - 1; j++) {


            for (int i = 0; i <= arr.length - 1; i++) {

                 if (arr[j].equals(arr[i])) {
                    k++;
                 }

            }
            if (k==1){
                System.out.print(arr[j]);
            }
        }*/
for (String a:arr) {
    int count =0;
    for (String each : arr) {
        if (a.equals(each)) {
            count++;
        }
    }
    if (count == 1) {
        System.out.println(a);
    }
    }
    }
}