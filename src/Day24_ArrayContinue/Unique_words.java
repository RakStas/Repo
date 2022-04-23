package Day24_ArrayContinue;

public class Unique_words {
    public static void main(String[] args) {
        String [] words = {"C#", "C#", "Java", "Pyton", "Pyton", "C++"};

        for (int j=0; j<=words.length-1; j++) {
            String s = words[j];
            int count = 0;

            for (int i = 0; i <= words.length - 1; i++) {
                String each = words[i];
                if (each == s) {
                    count++;
                }
            }
            if (count==1){
                System.out.print(s+" ");
            }

        }




    }
}
