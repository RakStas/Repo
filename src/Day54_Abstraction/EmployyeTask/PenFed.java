package Day54_Abstraction.EmployyeTask;

import java.time.LocalDate;

public class PenFed {


    public static void main(String[] args) {

       Developer developer1=new Developer("Alina", 'F', LocalDate.of(1996, 11, 30),
               "Sdet", 30000);
       Tester tester1=new Tester("Stas", 'M', LocalDate.of(1993, 06, 30),
                "QA", 31000);
        System.out.println(tester1);
        System.out.println(developer1);
        System.out.println(developer1.DoBr);



    }



}
