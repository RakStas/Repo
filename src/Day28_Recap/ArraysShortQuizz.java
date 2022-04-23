package Day28_Recap;

import java.util.Arrays;

public class ArraysShortQuizz {
    public static void main(String[] args) {
        char [] ch = {'A', 'B', 'C', 'D'};
        Arrays.sort(ch);
        for  (char each: ch){
            System.out.println(each);
            if (each=='D'){
                continue;
            }
        }
        System.out.println();
        int wd=0;
        String [] days = {"sun", "mon", "wed", "sut"};
        for (int i =0; i< days.length; i++){
            switch (days[i]){
                case "sat":
                case "sun":
                  wd-=1;
                  break;
                case"mon":
                    wd++;
                case "wed":
                    wd+=2;
                    System.out.println(wd);
            }
        }
        System.out.println("=========================");
        int []nums= {15,30,45,60,75};
        //           0   1  2 3  4
        nums [2]=nums[4]; //{15,30,75,60,75}
        nums [4]=90;      //{15,30,75,60,90}

        System.out.println("=========================");
        int arr1[]={1,2,3,4};
        int i=0;
        do{
            System.out.println(arr1[i]+ " ");
            i++; //1, 2, 3
        }while (i<arr1.length-1);

















    }
}
