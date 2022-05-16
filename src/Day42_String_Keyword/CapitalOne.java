package Day42_String_Keyword;

import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {



        Tester[] testers={new Tester(), new Tester(), new Tester()};
        testers[0].setInfo("Alina", 123, "Seniyor", 12525, 'F');
        testers[1].setInfo("Denis", 234, "Seniyor", 11525, 'M');
        testers[2].setInfo("Ahmud", 345, "Seniyor", 10525, 'M');
        System.out.println(testers[0]);

        ScramTeam team1=new ScramTeam();
        team1.setInfo("Volodia", "Kolian", "Illia");
        team1.addTesters(testers);
        System.out.println(team1.toSting());




    }

}
