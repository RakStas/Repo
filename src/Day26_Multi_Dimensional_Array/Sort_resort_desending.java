package Day26_Multi_Dimensional_Array;

import java.util.Arrays;

public class Sort_resort_desending {
    public static void main(String[] args) {
        int[] num = {5, 8, 6, 4, 5, 8, 56, 2, 45, 78};
        int num1 []= new int[num.length];
        Arrays.sort(num);

        int k = num.length-1;
        for (int i = 0; i<=num1.length-1; i++) {
            num1[i]=num[k];
            k--;
        }
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(num1));



        }
        }

