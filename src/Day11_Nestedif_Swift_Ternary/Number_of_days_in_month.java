package Day11_Nestedif_Swift_Ternary;

public class Number_of_days_in_month {
    public static void main(String[] args) {
        /*write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
         HINT:
                28 days: 2
                30 days: 4,6,9,11
                31 days: 1,3,5,7,8,10,12
                Inavlid:  num < 1 || num > 12
                */

        int month = 7;
        boolean days28=month==2;//for month that has 28 days
        boolean days30=month==4||month==6||month==9||month==11;//for month that has 30 days
        boolean invalid = month<1||month>12;
        boolean day31 = days28==false&&days30==false&&invalid==false;
        String result = "";
        if(days28){
            result="28 days";
        } else if (days30){
            result="30 days";
        } else if (invalid) {
            result="invalid";
        }else result="31 days";

        System.out.println(result);
        System.out.println("==========================");
        String result2=(days28)?"28 days":(days30)?"30 days":(invalid)?"invalid":"31 days";
        System.out.println(result2);


    }
}
