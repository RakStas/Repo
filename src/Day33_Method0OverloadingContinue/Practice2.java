package Day33_Method0OverloadingContinue;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("dd.MM.yy EEEE");
        String []name={"Аліна", "Емілія", "Надія", "Олексій", "Шон"};
        LocalDate DOB[]={LocalDate.of(1996, 11, 30),
                LocalDate.of(2020, 05, 14),
                LocalDate.of(1970, 2, 20),
                LocalDate.of(1966, 03, 21),
                LocalDate.of(2019, 05,20)
        };

        for (int i=0; i<=DOB.length-1; i++){
            System.out.println(name[i]+": "+DOB[i].format(timeFormat));
        }








    }
}
