package Day24_ArrayContinue;

public class Seredne_znachennya_Average {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10};
        //         0 1 2 3 4 5 6 7 8 9
        int sum=0;

        for(int i =arr.length-1; i>=0 ; i--){
            sum+=arr[i];
            System.out.print(arr[i]+" ");


        }
        double average = sum/(double)arr.length;
        System.out.println();
        System.out.println("sum is "+sum);
        System.out.println("average is "+average);



    }
}
