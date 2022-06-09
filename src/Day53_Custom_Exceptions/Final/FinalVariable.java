package Day53_Custom_Exceptions.Final;

import java.time.LocalDate;

public class FinalVariable {
    final static String eyeColor="Brown";
    final static String bloodType="III";

    public static void main(String[] args) {

        final LocalDate DoB=LocalDate.of(1993, 6, 30);
        //DoB=LocalDate.of(2000,5,6);

        System.out.println(DoB);
    }

}
