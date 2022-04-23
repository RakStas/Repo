package Day33_Method0OverloadingContinue;

import java.time.LocalDate;
import java.time.LocalTime;

public class Times {
    public static void main(String[] args) {
        //В часі особязково ГОДИНИ (до 24), ХВИЛИНИ(до 60), СЕКУНДИ (до 60)
        LocalTime t1 = LocalTime.of(22, 55, 45);
       // System.out.println(t1);
        LocalDate d1=LocalDate.now();
        LocalTime t2 = LocalTime.now();
        System.out.println("    "+t2);
        System.out.println(d1);


    }
}