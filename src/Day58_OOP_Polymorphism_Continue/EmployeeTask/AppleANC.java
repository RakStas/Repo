package Day58_OOP_Polymorphism_Continue.EmployeeTask;
import Day57_OOP_Polymorphism.Employee.*;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleANC {
    public static void main(String[] args) {
        Employee[] workers =  {
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),

                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),

                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M')

        };
        ArrayList<Employee>employees=new ArrayList<>(Arrays.asList(workers));

        int countTesters=0;
        int countDevelopers=0;

       /* for(int i=0; i<=employees.size()-1; i++){
            if(employees.get(i)instanceof Tester){
                countTesters++;
            }else countDevelopers++;
        }*/
        for(Employee each : employees){
            if(each instanceof Tester){
                countTesters++;
            }else
            {
                countDevelopers++;
            }
            }

        System.out.println("Testers: "+countTesters);
        System.out.println("Developers: "+countDevelopers);
    }

}
