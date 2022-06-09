package Day42_String_Keyword;

import java.util.ArrayList;
import java.util.Arrays;


class tester{/*
    String name;
    int ID;
    String jobTitle;
    double salary;
    char gender;
    public  void setInfo(String name, int ID, String jobTitle, double salary, char gender)
    {

        this.name=name;
        this.ID=ID;
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.gender=gender;
    }
    public void smokeTesting()
    {
        System.out.println(name+" made smoke testing. Him ID is "+ID);
    }
    public void creatingTicket()
    {
        System.out.println(name+" work at " +jobTitle+" Salary is "+salary);
    }
    public String toString()
    {
        return "Name is "+name+"; ID is "+ID+"; Job title is "+jobTitle+"; salary is $"+ salary;
    }
}
class developer{
    String name;
    int ID;
    String jobTitle;
    double salary;
    char gender;

    public  void setInfo(String name, int ID, String jobTitle, double salary, char gender)
    {
        this.name=name;
        this.ID=ID;
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.gender=gender;
    }
    public void coding(){
        System.out.println(name+" is coding. Him ID is "+ID);
    }

    public void fixBug(){
        System.out.println(name+" is fixing bugs");
    }

    public String toString(){
        return "Name is "+name+"; ID is "+ID+"; Job title is "+jobTitle+"; salary is $"+ salary;
    }
}
class scramteam {
    ArrayList<Tester> testers = new ArrayList<>();
    ArrayList<Developer> developers = new ArrayList<>();
    String PO;
    String BA;
    String SM;

    public void setInfo(String PO, String BA, String SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTester(Tester tester) {
        testers.add(tester);

    }

    public void addTesters(Tester[] testers) {
        if (testers.length == 0) {
            return;
        }
        this.testers.addAll(Arrays.asList(testers));
    }

    public void removeTester(int ID) {
        testers.removeIf(p -> p.ID == ID);
    }

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void addDeveloper(Developer[] developers) {
        if (developers.length == 0) {
            return;
        }
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeDeveloper(int ID) {
        developers.removeIf(p -> p.ID == ID);
    }

    public String toSting() {
        return testers.size() + " testers;\n" + developers.size() + " developers;" +
                "\nPO name is " + PO + "; BA name is " + BA + "; SM name is " + SM + ";";
    }
}
class capitalone {
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

        ScramTeam team2 = new ScramTeam();
        team2.setInfo("Shief", "Biness", "Master i Margarita");
        team2.addTesters(testers1);
        team2.addDeveloper(developers1);

        Developer dev2 = new Developer();
        dev2.setInfo("Olen", 2255, "Olen", 0, 'F');
        team1.addDeveloper(dev2);
        System.out.println(team2.toSting());

        ScramTeam scramTeam = new ScramTeam();
   }*/
}
public class WarmUp {

}
