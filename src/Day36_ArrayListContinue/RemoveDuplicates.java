package Day36_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Character>ch=new ArrayList<>();
        ArrayList<Character>nonDup=new ArrayList<>();
        ch.addAll( Arrays.asList ('A','A', 'B', 'B', 'C', 'C') );
        for (Character each:ch){
            if(!nonDup.contains(each)){
                nonDup.add(each);
            }
        }
        System.out.println(nonDup);




    }
}
