package Day16String;

import java.util.Scanner;
/*if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself*/
public class CheckWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str="fgh";
        //last index = length -1
        //second last index =length -2
        //third last index = length -3
        if (str.length()==0){
            System.out.println("Str is empty");
        }else if(str.length()>3){
            System.out.println(str.substring(str.length()-3));
        }else {
            System.out.println(str);
        }
    }
}
