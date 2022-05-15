package Day42_String_Keyword;

import java.util.ArrayList;
import java.util.Arrays;

public class Tester {

    String name;
    int ID;
    String jobTitle;
    double salary;

    public  void setInfo(String name, int ID, String jobTitle, double salary) {

        this.name=name;
        this.ID=ID;
        this.jobTitle=jobTitle;
        this.salary=salary;

    }
    public void smokeTesting(){
        System.out.println(name+" made smoke testing. Him ID is "+ID);
    }
    public void creatingTicket(){
        System.out.println(name+" work at " +jobTitle+" Salary is "+salary);
    }
    public String toString(){
        return "Fenito for "+name+" "+jobTitle;
    }
    static class smokeTesting{
       /* public static void main(String[] args) {
            Tester tester1=new testers();
            testers tester2=new testers();
            testers tester3=new testers();
            testers tester4=new testers();
            testers tester5=new testers();
            testers tester6=new testers();



            ArrayList<testers>tester=new ArrayList<>();
            tester.addAll(Arrays.asList(tester1, tester2, tester3, tester4, tester5, tester6));

            tester1.setInfo("valera", 1, "Cleaner", 1201);
            tester1.setInfo("vgh", 2, "Clean", 1201);
            tester1.setInfo("koliaa", 3, "Cleaner", 1201);
            tester1.setInfo("ignis", 4, "Cleaner", 1201);
            tester1.setInfo("Nokia", 5, "Cleaner", 1201);
            tester1.setInfo("Stepan", 6, "Cleaner", 1201);*/
        }
    }

