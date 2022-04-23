package myHomeWork.Day12Task1;

public class Longest_String_Array {
    public static void main(String[] args) {


        String[] arr = {"S", "Al", "Stas", "Alina","Stasj","Stahs","Sttas"};
        int minLength = arr[0].length();
        for (int i = 0; i <= arr.length - 1; i++) {
            int l = arr[i].length();
            if (minLength < l) {
                minLength = l;
            }

        }

        System.out.println(minLength);
        for (int j = 0; j <= arr.length - 1; j++) {

            if (arr[j].length() == minLength) {

                System.out.println(arr[j]);
            }

        }

    }
}