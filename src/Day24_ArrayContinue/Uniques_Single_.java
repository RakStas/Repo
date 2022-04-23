package Day24_ArrayContinue;

import java.util.Scanner;

public class Uniques_Single_ {
    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
        //String  input = scan.nextLine();
        String str = "abccddfdgfhgjhgfa";

        String uniq = "";

        for (int i=0; i<=str.length()-1; i++ ) {
           char ch = str.charAt(i);
           int first=str.indexOf(ch);
           int last=str.lastIndexOf(ch);
           if (first==last){
               uniq+=ch;
           }

        }

        System.out.println(uniq);





    }
}
