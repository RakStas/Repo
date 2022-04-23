package Day30_Custom_Method_Return_Method;

import java.util.Arrays;

public class MaxMinArray_Void_Return {
    public static void main(String[] args) {
        int num []={-98,14,65,888,418};

        System.out.println(Max(num));
        System.out.println("==========");
        int nnum2[]={56,98,45,32,111};
        max2(nnum2);
    }
    public static int Max (int [] num){
        Arrays.sort(num);
        int max = num[num.length-1];
        return max;
    }
    public static void max2 (int [] num2){
        Arrays.sort(num2);
        int max=num2[num2.length-1];
        System.out.println(max);
    }


}
