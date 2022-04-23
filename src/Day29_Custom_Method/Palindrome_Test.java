package Day29_Custom_Method;
/*
kayak==>kayak    true
java ==> avaj    false
 */
public class Palindrome_Test {
    public static void main(String[] args) {
    palindrome("kayaka");
    }
    public static void palindrome(String word){
        String reverse="";
        for (int i=word.length()-1; i>=0; i-- ){
            reverse+=word.charAt(i);
        }
        System.out.println(reverse.equalsIgnoreCase(word));
        }
    }




