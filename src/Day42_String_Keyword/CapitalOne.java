package Day42_String_Keyword;

import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {


        Tester[] testers = {new Tester(), new Tester(), new Tester()};
        testers[0].setInfo("Alina", 123, "Lead tester", 12525, 'F');
        testers[1].setInfo("Denis", 234, "Senior level tester", 11525, 'M');
        testers[2].setInfo("Ahmed", 345, "Middle tester", 10525, 'M');

        Developer[] developers = {new Developer(), new Developer(), new Developer(), new Developer(), new Developer()};
        developers[0].setInfo("Oksana", 1255, "Lead team", 55525, 'F');
        developers[1].setInfo("Roza", 1244, "Senior", 5525, 'F');
        developers[2].setInfo("Vika", 1458, "middle", 5525, 'F');
        developers[3].setInfo("Olena", 582, "Middle", 525, 'F');
        developers[4].setInfo("Stepan", 12855, "Jun", 25, 'M');


        ScramTeam team1 = new ScramTeam();
        team1.setInfo("Volodia", "Kolian", "Illia");
        team1.addTesters(testers);
        team1.addDeveloper(developers);

        System.out.println(team1.toSting());
        System.out.println();

        for (Tester each : testers) {
            System.out.println(each.name + " : $" + each.salary);
        }
        System.out.println();
        for (Developer each : developers) {
            System.out.println(each.name + " : $" + each.salary);
        }
        System.out.println("-------------");
        team1.removeDeveloper(582);
        System.out.println(team1.toSting());

        System.out.println("-------------");
        Developer dev1 = new Developer();
        dev1.setInfo("Vasil", 22255, "Team shit", 0, 'F');
        team1.addDeveloper(dev1);
        System.out.println(team1.toSting());


        Tester[] testers1 = {new Tester(), new Tester()};
        testers1[0].setInfo("Vitya", 125, "Pisyn", 125, 'M');
        testers1[1].setInfo("Varvara", 222, "Pisyha", 125454, 'F');

        Developer[] developers1 = {new Developer(), new Developer(), new Developer(), new Developer()};
        developers1[0].setInfo("Kozel", 488, "Rogatyi", 5889, 'M');
        developers1[1].setInfo("Rogan", 419620, "Svitle", 58819, 'M');
        developers1[2].setInfo("Obolon", 4579, "Mitsne", 584489, 'M');
        developers1[3].setInfo("Zibert", 4800, "Nemetskoe", 589, 'M');

        ScramTeam team2=new ScramTeam();
        team2.setInfo("Shief", "Biness", "Master i Margarita");
        team2.addTesters(testers1);
        team2.addDeveloper(developers1);

        Developer dev2 = new Developer();
        dev2.setInfo("Olen", 2255, "Olen", 0, 'F');
        team1.addDeveloper(dev2);
        System.out.println(team2.toSting());

        ScramTeam scramTeam=new ScramTeam();


    }
}