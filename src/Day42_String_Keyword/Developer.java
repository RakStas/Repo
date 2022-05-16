package Day42_String_Keyword;

import Day41_Objects_Practice.Testers;

public class Developer {

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






