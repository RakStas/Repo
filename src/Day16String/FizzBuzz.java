package Day16String;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = scan.next();
        System.out.println("Enter your Second word");
        String word2 = scan.next();

        boolean result = word1.length() == 5 && word2.length() == 5;
        /*умова перша буква першого слова повинна відповідати останній букві другого слова,
        та довжина слів повинна складатися із 5 букв, не більше і не менше*/
        /*if (result){
            char ch1=word1.charAt(word1.length()-1); //остання буква першого слова
            char ch2=word2.charAt(0); //перша буква другого слова
            if(ch1==ch2){
                System.out.println("Fizz");
                            }else {
                System.out.println("Buzz");
            }
        }else {System.out.println("Need to be more 5 chars length");

        }*/

        if (result) {
            boolean b1=word1.endsWith("" + word2.charAt(0));
            boolean b2=word2.startsWith("" + word1.charAt(word1.length() - 1));
            if (b1&&b2) {

                System.out.println("Fizz");

            } else {
                System.out.println("Buzz");
            }
        }else {
                System.out.println("Need be more 5 char");
            }

        }


    }


