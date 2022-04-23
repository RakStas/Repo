package Day33_Wrapper_Class_ArrayList_Intro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class warmup {
    /*use the LocalDate & Time get the current date and time in the following format:

    Sunday, 09:51 AM, Jul/26/2020*/

    public static void main(String[] args) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy ");
        LocalDateTime ldt= LocalDateTime.of(2020, 06, 26, 9,51 );
        System.out.println(ldt.format(dateFormat));


    }
}
