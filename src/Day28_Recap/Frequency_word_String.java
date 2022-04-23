package Day28_Recap;

import java.util.Locale;
import java.util.Scanner;

public class Frequency_word_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word =scan.nextLine();
                String str = "jAvaJavaJAVA";
        int digit = 0;
        //substring (0,4)  Java (номер індексу і рядку стрінг, і закінчується номером 4, а не 3)
        //substring (1,5) avaj
        //substring (2,6)vaja
        // substring (3,7)ajav
        // substring (4,8)java
        // substring (5,9)avaJ...

        // substring (i, i+4), start use length -4
       /* System.out.println("Write word to find");


        String word = scan.nextLine();

        str.toLowerCase(Locale.ROOT);
        for(int i =0; i<=2; i++){
        if (str.toLowerCase(Locale.ROOT).contains(word)){
            digit++;
        }
        }
        System.out.println(digit);*/
        String str1=str.toLowerCase(Locale.ROOT);
        String word1=word.toLowerCase(Locale.ROOT);
        System.out.println(word1);
        for (int i=0; i<=str.length()-4; i++){
           String s = str1.substring(i,i+4);
           if (s.equals(word1)){
               digit ++;
           }
        }
        System.out.println(digit);
    }
}
