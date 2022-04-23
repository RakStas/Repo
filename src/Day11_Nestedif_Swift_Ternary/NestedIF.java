package Day11_Nestedif_Swift_Ternary;

public class NestedIF {
    public static void main(String[] args) {
            /* 90-100 ==A
            80-89==B
            70-79==c
            60-69==d
            50-59==f
            other invalid*/

        int digit = 105;
        String D = "";
        if (digit >= 0 && digit <= 100) {
            if (digit>=90) {
                D="A";
            }else  if (digit>=80) {
                D="B";
            } else if (digit>=70) {
                D="C";
            }else if (digit>=60) {
                D="D";
            }else  {
                D="F";
            }
        } else{D = "Invalid";
            }
        System.out.println(D);

        System.out.println("==========================");
        /*
        Task 1.
            precondition: minimum salary 30k
            sub condition: minimum job history
        Task 2
            1 - monday
            2-Thursday
            ...
            7- Sunday
            invalid == there are not that days
        Task 3
            Write a program that can find the number of days in a month
         */






        }




    }

