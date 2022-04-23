package Day22_Nested_Loop;

import java.util.Scanner;

public class UpperAndLower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = scan.nextLine();
        char firstch1= input.charAt(0);
        char lastCh=input.charAt(input.length()-1);

        boolean start=firstch1>='A'&&firstch1<='Z'; //upper case charakters
        boolean end= lastCh>='a'&&lastCh<='z'; //lower char

        System.out.println(start&&end);






    }
}
