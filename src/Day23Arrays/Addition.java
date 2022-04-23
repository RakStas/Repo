package Day23Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        while(true){

            System.out.println("Enter first numbers");
            int num1= scan.nextInt();
            System.out.println("Enter second number");
            int num2= scan.nextInt();
            System.out.println(num1+num2);
            System.out.println("Do you want play game again?");
            String answer= scan.next().toLowerCase(Locale.ROOT);

            if  (!(answer.equals("yes"))||(answer.equals("no")))
            {
                System.out.println(answer+" is invalid answer, enter YES or NO");
                System.out.println("Do you want to continue?");
            answer= scan.next().toLowerCase(Locale.ROOT);

            }

            if (answer.equals("no")){
            break;

            }


        }




    }
}
