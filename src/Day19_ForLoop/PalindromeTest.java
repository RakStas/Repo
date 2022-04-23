package Day19_ForLoop;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String reerseStr="";
        for (int i=str.length()-1; i>=0; i--){
            reerseStr+=str.charAt(i);
        }
        System.out.println(reerseStr);
        System.out.println(reerseStr.equalsIgnoreCase(str));






    }
}
