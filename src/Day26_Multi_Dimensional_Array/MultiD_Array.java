package Day26_Multi_Dimensional_Array;

import java.util.Arrays;

public class MultiD_Array {
    public static void main(String[] args) {
        char [] ch1 = {'A','B',};
        char[] ch2= {'C', 'D', 'E'};
        char [] ch3 = {'F', 'G', 'H'};

        char [][]ch4={ {'A','B',}, {'C', 'D', 'E'},{'F', 'G', 'H'}  };
        System.out.println(ch4[2][1]);

        System.out.println("===========================");

        //1 2 3      4      5 6      7 8 9 10
        int [][] arr= {{1,2,3},{4},{5,6},{7,8,9,10}};
        for (int i = arr.length-1; i>=0; i--){
        System.out.println(Arrays.toString(arr[i]));}

        System.out.println(Arrays.deepToString(arr));






    }
}
