package Day32_MetrhodOverLoading;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {
        int [] arr={2,1,4,5,7};
        Arrays.sort(arr); //використання методу перший раз. Важливо використовувати інший параметр в методі "arr"
        System.out.println(Arrays.toString(arr));

        String str[]={"A", "F","D" };
        Arrays.sort(str);   //використання методу другий раз. Другий метод з параметром "str"
        System.out.println(str);
    }
    public static void method (int a){

    }
    public static void method (int a, int b){

    }

}
