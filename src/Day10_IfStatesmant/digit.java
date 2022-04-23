package Day10_IfStatesmant;

public class digit {
    public static void main(String[] args) {
        char character = 55;
        boolean isDigit = character >= 48 && character <= 57;
        String abc = "";

        if (isDigit) {
            abc = character + " is digit";
        } else {
            abc = character + " is not digit";
        }
        System.out.println(abc);
    }





    }

