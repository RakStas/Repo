package Day23Arrays;

import java.util.Scanner;

public class DaysWeek {
    public static void main(String[] args) {
       //
        //String [] week = {"mon", "tue", "wed", "thurs", "friday", "saturday", "sunday"};
        String [] day =new String[7];
        day [6]="Sunday";
        day [1]="tuesday";
        day [4]="friday";
        day [3]="thursday";
        day [2]="wednesday";
        day [5]="friday";
        day [0]="monday";
        for (int i=0; i<= day.length-1; i++){
            System.out.print(day[i]+" ");
        }
        System.out.println();
        Scanner scan = new Scanner(System.in);

        System.out.println("Write number of the day");
        int num= scan.nextInt();
        System.out.println("The day of the week is "+day[num-1]);







    }
}
