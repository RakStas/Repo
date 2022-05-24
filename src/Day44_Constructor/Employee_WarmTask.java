package Day44_Constructor;

public class Employee_WarmTask {
    String name;
    int ID;
    int snn;
    String jobTitle;
    int salary;
    char gender;
    static boolean isEmployed;
    static boolean hasSalary;

    static {isEmployed=true;
        hasSalary=true;
    }

    public void SetEmployerInfo(String name, int ID,int snn,String jobTitle,int salary,char gender){
        this.name=name;
        this.ID=ID;
        this.snn=snn;
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.gender=gender;
    }
    public String toString(){
        return "Name is "+name+
                "\nGender is "+gender+
                "\nID "+ID+
                "\nSnn"+snn+
                "\nJob title is "+jobTitle+
                "\nSalary is $"+salary;
    }


}
