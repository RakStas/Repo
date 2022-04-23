package Day16String;

import java.util.Scanner;

public class firstlastCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word");
        String word = scan.next();
        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() - 1);

        //System.out.println(firstChar==lastChar);

        if (firstChar == lastChar) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}

