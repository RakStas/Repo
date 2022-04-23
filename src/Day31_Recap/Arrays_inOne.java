package Day31_Recap;


public class Arrays_inOne {
    public static void main(String[] args) {
        int []arr1={1,2,3,4,5,6};
        int [] arr2={7,8,9,10};




    }
    public static int[] TwoArrInOne (int []arr1,int []arr2){
       int size = (arr1.length+arr2.length);
       int arr3[]=new int[size];
       int index =0;
       for (int each:arr1){
           arr3[index]=each;
           index++;
       }
        for (int each:arr2){
            arr3[index]=each;
            index++;
        }
        return  arr3;
    }
}
