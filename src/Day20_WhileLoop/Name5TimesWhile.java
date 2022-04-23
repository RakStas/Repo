package Day20_WhileLoop;

import java.util.Scanner;

public class Name5TimesWhile {
    public static void main(String[] args) {

        int dig=1;
        while (dig<=5)
        {

            System.out.println(dig+" "+"Stas");
            dig++;}

        System.out.println("================");
        Scanner scan=new Scanner(System.in);
        String str1= scan.nextLine();
        int index=str1.length()-1;
        while (index>=0){
            System.out.print(str1.charAt(index));
            index--;
        }




    }
}
