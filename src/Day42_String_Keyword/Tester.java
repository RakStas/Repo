package Day42_String_Keyword;

import java.util.ArrayList;
import java.util.Arrays;

public class Tester {
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

