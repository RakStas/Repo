package Day33_Method0OverloadingContinue;
/*DateTimeFormatter.ofPatter("");

        20  2020
        year: yy, yyyy
        Month: MM(number), MMM(three letters), MMMM
        days: dd*/

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormating {
    public static void main(String[] args) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(" dd MMMM YYYY E");

        LocalDate l1=LocalDate.now();
        System.out.println(l1.format(dateFormat));
        System.out.println("=================");


        /*
            hours: hh
            minutes: mm
            seconds: ss
            am/pm: a
        */
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime LT=LocalTime.now();
        System.out.println(LT.format(timeFormat));

        DateTimeFormatter DTF=DateTimeFormatter.ofPattern("dd MMMM yyyy  hh:mm, EEEE");
        LocalDateTime lDT1=LocalDateTime.now();
        System.out.println(lDT1.format(DTF));






    }
}
