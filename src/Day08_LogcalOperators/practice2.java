package Day08_LogcalOperators;

public class practice2 {
    public static void main(String[] args) {
            String firstName = "Emilia";
            String lastName = "RAK";
            int age = 1;
            String citizen1 = "Turkey";
            String  citize2 = "France";
            String citizen3 ="UA";

            boolean eligbleAge = age>=18;
            boolean usCitien = citizen1 == "USA" || citize2=="UA"||citizen3=="UA";
            boolean eleg = eligbleAge&&usCitien;

        System.out.println(firstName+" "+lastName+" will go to the vote: "+eleg);



    }
}
