package Day49_InheritancePractice.ScrumTeam;

import Day41_Objects_Practice.Testers;

public class AppleINC {
    public static void main(String[] args) {


        Tester tester1=new Tester("Alina", 25, 'F', 125000, 123456, "SDET" );
        Tester tester2=new Tester("Stas", 29, 'M', 125500, 13695, "QA");
        Tester tester3=new Tester("Emilia", 2, 'F', 950001, 30052020, "SDET");



        Tester[] testers={tester1, tester2, tester3};



        Developer developer1=new Developer("Oleksiy", 55, 'M', 545202, 29031996, "Father" );
        Developer developer2=new Developer("Nadia", 50, 'F', 575555, 20021970, "Mother" );
        Developer developer3=new Developer("Yana", 31, 'F', 268555, 30061990, "Sister" );
        Developer developer4=new Developer("Timur", 3, 'M', 526462, 14102019, "Sun" );

        Developer[] developers={developer1, developer2, developer3, developer4};

        ScrumTeam scrumTeam1=new ScrumTeam(testers, developers);
        System.out.println(scrumTeam1);
    }
}
