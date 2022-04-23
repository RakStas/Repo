package Day10_IfStatesmant;

public class Character_Identify {
    public static void main(String[] args) {
        char character = 55;
        boolean isAlphabetic = (character >= 65 && character <= 90) || (character >= 97 && character <= 122);
        String alphabet = "";

        if (isAlphabetic) {
            //{System.out.println(character+" is Alphabetic");}
            alphabet = character + " is Alphabetic";
        } else {
            //{System.out.println(character+" is not Alphabetic");}
            alphabet = character + " is not Alphabetic";

        }
        System.out.println(alphabet);
    }

    }

