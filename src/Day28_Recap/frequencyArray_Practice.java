package Day28_Recap;

import java.util.Scanner;

public class frequencyArray_Practice {
    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
        String [] str = {"Java", "Java", "C#"};
        int count = 0;
        String word = "Java";

        for (String each: str){
            if(word.equalsIgnoreCase(each)){
                count++;
            }
        }

        System.out.println(count);















    }
}
