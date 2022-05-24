package Day43_Static_Continue;


import java.util.ArrayList;
import java.util.Arrays;

public class DataArrays {
    static int []arr=new int[5];
    static ArrayList<Integer>list=new ArrayList<>();
    static {
        arr[0]=1;
        arr[1]=4;
        arr[2]=6;
        arr[3]=7;
        arr[4]=9;

        list.add(5);
        list.add(6);
        list.add(7);}
    public static void main(String[] args) {

        System.out.println(Arrays.toString(arr));
        System.out.println(list);
        
    }

}
