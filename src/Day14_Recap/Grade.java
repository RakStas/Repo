package Day14_Recap;

import java.util.Scanner;
/*90 <= score <= 100 ==> Excellent
                    80 <= score <= 89 ==> Great
                    70 <= score <= 79 ==> Good
                    60 <= score <= 69 ==> Passed
                    0 <= score <= 59 ==> Failed
                    other == > Invalid Entry*/
public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your scope");
        double scope = scan.nextDouble();
        String result="";
        scan.close();

        if(scope>=0&&scope<=100){
            if (scope>=90&&scope<=100){
                result="Excellent";
            }
            else if (scope>=80&&scope<=89){
                result="Great";
            }
            else if (scope>=70&&scope<=79){
                result="Good";
            }else if (scope>=60&&scope<=69){
                result="Passed";
            }else if (scope>=0&&scope<=59){
                result="Failed";
            }
        } else result="Invalid";



        System.out.println("Your result is "+result+" my congratulation!!!");
        scan.close();




    }
}
