package Day25_Practice;

public class Shortest_String_Too {
    public static void main(String[] args) {
        String[] arr = {"S", "Al", "Stas", "Alina","Stasj","Stahs","Sttas"};
        int minLength = arr[0].length();
        for (String each:arr) {
            int l = each.length();
            if (minLength < each.length()) {
                minLength = each.length();
            }

        }

        System.out.println(minLength);
        for (String each:arr) {

            if (each.length() == minLength) {

                System.out.println(each);
            }

        }










    }
}
