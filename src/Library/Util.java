package Library;

import java.util.Arrays;
import java.util.Locale;

public class Util {

    public static String removeDuplicate(String str) {
        String nonDup = "";
        for (String each : str.split("")) {
            if (!nonDup.contains(each)) {
                nonDup += each;
            }
        }

        return nonDup;
    }
        //видаляє повторюватьні символи із стрінг
    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);

        }
        return (result);
    }
    // Перевертах стрінг з початку до кінця. Тобто навпаки
    public static int Max(int num[]) {
        int max = num[0];
        for (int each : num) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
    //максимум
    public static int Min(int num[]) {
        int min = num[0];
        for (int each : num) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }
    // мінімум
    public static int frequency(String str, char ch){ //check how much equals char in string
        int count =0;
        for (char each:str.toCharArray()){
            if (each==ch){
                count++;
            }
        }
        return count;
    }
    //кількість унікальних значень із стрінг
    public static String uniques (String str){
        String uniques = "";
        for (char each:str.toCharArray()) {
            int count = frequency(str, each);
            if (count == 1) {
                uniques += each;
            }
        }
        return uniques;
    }
    //унікальні значення стрінг
    public static int[] TwoArraysInOneArr (int []arr1,int []arr2){
        int size = (arr1.length+arr2.length);
        int arr3[]=new int[size];
        int index =0;
        for (int each:arr1){
            arr3[index]=each;
            index++;
        }
        for (int each:arr2){
            arr3[index]=each;
            index++;
        }
        return  arr3;
    }
    //два аррей в один
    public static String FormatFull_name(String firstName, String lastName){
        firstName = firstName.substring(0,1).toUpperCase(Locale.ROOT) + firstName.substring(1).toLowerCase(Locale.ROOT);
        lastName  = lastName.substring(0,1).toUpperCase(Locale.ROOT)+lastName.substring(1).toLowerCase(Locale.ROOT);
        String fullName = (firstName + " "+lastName);
        return fullName;
    }
    //Робить в слові першу букву з великої літери, залишок слова буде міслити тільки маленькі літери.
    public static double Calculator(double num1, char oper, double num2) {
        double result =(oper=='+')?num1+num2:(oper=='-')?num1-num2:(oper=='+')?num1+num2:
                (oper=='*')?num1*num2:(oper=='/')?num1/num2:(oper=='%')?num1%num2:0;




        return result;
    }
    //калькулятор з двома числами
    public static int[] element(int[] arr, int single) {

        int arrResult[] = new int[arr.length + 1];
        arrResult[arrResult.length - 1] = single;
        int count = 0;
        for (int each : arr) {
            arrResult[count] = each;

            count++;
        }

        return arrResult;
    }
    //добавляє число в аррей в кінці. У програмі один аррей інт, і число інт.
    public static double[] sortDescending(double arr[]) {
        Arrays.sort(arr);
        double arr2[] = new double[arr.length];
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[count] = arr[i];
            count++;

        }
        return arr2;
    }
    //сортування від більшого до меншого ДАБЛ
    public static String[] sortDescending(String arr[]) {
        Arrays.sort(arr);
        String arr2[] = new String[arr.length];
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[count] = arr[i];
            count++;

        }
        return arr2;
    }
    //сортування від більшого до меншого СТРІНГ
    public static int[] sortDescending(int arr[]) {
        Arrays.sort(arr);
        int arr2[] = new int[arr.length];
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[count] = arr[i];
            count++;

        }
        return arr2;
    }


    //сортування від більшого до меншого ІНТ
    public static void uniqueInt(int[] arr) {

        for (int each : arr) {
            int count = 0;
            for (int each1 : arr) {
                if (each == each1) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(each + " ");
            }

        }
        System.out.println();
    }
    //виводить унікальний ІНТ із аррей
    public static void uniqueInt(double[] arr) {

        for (double each : arr) {
            int count = 0;
            for (double each1 : arr) {
                if (each == each1) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(each + " ");
            }

        }
        System.out.println();
    }
    //виводить унікальний ДАБЛ із аррей
    public static void uniqueInt(char[] arr) {

        for (char each : arr) {
            char count = 0;
            for (char each1 : arr) {
                if (each == each1) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(each + " ");
            }

        }
        System.out.println();
    }
    //виводить унікальний ЧАР із аррей
    public static void uniqueInt(String[] arr) {

        for (String each : arr) {
            int count = 0;
            for (String each1 : arr) {
                if ( each.equals(each1) ) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(each + " ");
            }

        }
        System.out.println();
    }
    //виводить унікальний СТРІНГ  із аррей
    public static Integer[] sortDescending(Integer arr[]) {
        Arrays.sort(arr);
        Integer arr2[] = new Integer[arr.length];
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[count] = arr[i];
            count++;

        }
        return arr2;
    }
    //сортує від меншого до більшого та повертахє начення на від більшого до меншого
    public static Double[] sortDescending(Double arr[]) {
        Arrays.sort(arr);
        Double arr2[] = new Double[arr.length];
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[count] = arr[i];
            count++;

        }
        return arr2;
    }
    //сортує від меншого до більшого та повертахє начення на від більшого до меншого
    public static Character[] sortDescending(Character arr[]) {
        Arrays.sort(arr);
        Character arr2[] = new Character[arr.length];
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[count] = arr[i];
            count++;

        }
        return arr2;
    }
    //сортує від меншого до більшого та повертахє начення на від більшого до меншого
    public static String[] TwoArraysInOneArr (String []arr1,String []arr2){

        String arr3[]=new String[arr1.length+arr2.length];
        int index =0;
        for (String each:arr1){
            arr3[index]=each;
            index++;
        }
        for (String each:arr2){
            arr3[index]=each;
            index++;
        }
        return  arr3;
    }
    //обєднує 2 аррей  стрінг
    public static Integer[] TwoArraysInOneArr (Integer []arr1, Integer []arr2){

        Integer arr3[]=new Integer[arr1.length+arr2.length];
        int index =0;
        for (Integer each:arr1){
            arr3[index]=each;
            index++;
        }
        for (Integer each:arr2){
            arr3[index]=each;
            index++;
        }
        return  arr3;
    }
    //обєднує 2 аррей, wrapper classes
    public static Double[] TwoArraysInOneArr (Double []arr1, Double []arr2){

        Double arr3[]=new Double[arr1.length+arr2.length];
        int index =0;
        for (Double each:arr1){
            arr3[index]=each;
            index++;
        }
        for (Double each:arr2){
            arr3[index]=each;
            index++;
        }
        return  arr3;
    }
    //обєднує 2 аррей, wrapper classes
    public static Character[] TwoArraysInOneArr (Character []arr1, Character []arr2){

        Character arr3[]=new Character[arr1.length+arr2.length];
        int index =0;
        for (Character each:arr1){
            arr3[index]=each;
            index++;
        }
        for (Character each:arr2){
            arr3[index]=each;
            index++;
        }
        return  arr3;
    }
    //обєднує 2 аррей, wrapper classes


}