package Day11_Nestedif_Swift_Ternary;

public class Day_Month {
    public static void main(String[] args) {
        int month = 2;
        boolean validMonth = (month >= 1 && month <= 12);

        String reslt = "";

        /*if (validMonth) {
            if (month == 2) {
                reslt = "29 dys";
            } else if (month == 4 && month == 6 && month == 9 && month == 11) {
                reslt = "30 dys";
            } else {
                reslt = "31 days";
            }
        } else {
            reslt = "there no that day"
            ;
        }*/

        reslt=(month == 2)?"28 days":(month == 4 && month == 6 && month == 9 && month == 11)?"30 days":"31 days";
        System.out.println(reslt);
    }
}
