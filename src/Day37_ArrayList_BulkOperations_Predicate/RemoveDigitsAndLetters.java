package Day37_ArrayList_BulkOperations_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDigitsAndLetters {
    public static void main(String[] args) {
        //input list: {a,b,c,3,4,5,6,&,%,@,#,*}
        // output  list: {&,%,@,#,*}
        ArrayList<Character> ch=new ArrayList<>();
        ch.addAll(Arrays.asList('a','b','c','3','4','5','6','&','%','@','#','*'));
        ch.removeIf(p->Character.isDigit(p)||Character.isLetter(p));
        System.out.println(ch);
        System.out.println();
        System.out.println("=====================");
        ArrayList<Character> list=new ArrayList<>();
        list.addAll(Arrays.asList('a','b','c','3','4','5','6','&','%','@','#','*'));

        ArrayList<Character>digit=new ArrayList<>();//[3,4,5,6]
        digit.addAll(list);
        digit.removeIf(p->!Character.isDigit(p));

        System.out.println("Digit is: "+digit);

        ArrayList<Character>letters=new ArrayList<>();//[a,b,c]
        letters.addAll(list);
        letters.removeIf(p->!Character.isLetter(p));

        System.out.println("Letter is: "+letters);

        ArrayList<Character>specialChar=new ArrayList<>();//[&','%','@','#','*']
        specialChar.addAll(list);
        specialChar.removeAll(letters);
        specialChar.removeAll(digit);

        System.out.println("Char is: "+specialChar);




    }
}
