package Day23Arrays;
/*write a prgram that can return the frequency of every single characters from the string:
        ex:
        str1 = "aabbccaa";
        output: a4b2c2

        HINT:
        easier approach:
        1. remove duplicates ==> str2 = "abc"
        2. then find each of str2' character' frequency in str1 ==> 4, 2, 2
        3. result: a4b2c2*/
import java.util.Scanner;

public class frequencyOfChar {
    public static void main(String[] args) {

            String str="dfxcggfgbg"; //ABAB

            String non="";// AB
            String result = "";//A4B4
            for (int i=0; i<=str.length()-1;i++){
                String ch =""+str.charAt(i); //
                if(!non.contains(ch)){
                    non+=ch;
                }
            }

        System.out.println(non);

            for(int j=0; j<=non.length()-1; j++) {
                char ch = non.charAt(j);
                int count = 0;
                for (int i = 0; i <= str.length() - 1; i++) {
                    if (str.charAt(i) == ch) {
                        count += 1;
                    }
                }
                result += "" + ch + count; //

            }
        System.out.println(result);

    }
}
