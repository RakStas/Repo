package Day26_Multi_Dimensional_Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class Concad_Word {
    public static void main(String[] args) {
        String input = "Java is cool Java  Java Java Java Java Java Java is fun.  Python Python Python Python is great";
        // Arrays
        String[] word = input.split(" ");
        System.out.println(Arrays.toString(word));
        int countJava = 0;
        int countPython = 0;

        for (String each : word) {
            if (each.toLowerCase().contains("java")) {
                countJava++;
            }else if(each.toLowerCase().contains("python")){
                countPython++;
            }
        }
        System.out.println(countJava+" Java, "+countPython+" Python");

    }
}













