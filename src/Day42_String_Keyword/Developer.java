package Day42_String_Keyword;

import Day41_Objects_Practice.Testers;

public class Developer {

    String name;
    int ID;
    String jobTitle;
    double salary;
    public  void setInfo(String name, int ID, String jobTitle, double salary)
    {
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
    }






