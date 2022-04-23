package Day28_Recap;

import java.util.Scanner;

public class Frequency_word_String_1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str="";
        System.out.println("Write word to find");
       String word = scan.nextLine();
        int lth = word.length();
      //  System.out.println(lth);


        int count =0;

        for (int i = 0; i <=str.length()-lth; i++) {
           if( str.substring(i, i+lth).equals(word) ){
               count++;
           }

        }
        System.out.println(word+" was write "+count);



    }
}
