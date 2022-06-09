package Day49_InheritancePractice.ScrumTeam;

public class Employee extends Person {
    public double salary;
    public int ID;
    public String jobTitle;

    public void setInfo(String name, int age, char gender, double salary, int ID, String jobTitle) {
        setInfo(name, age, gender);
        this.salary = salary;
        this.ID = ID;
        this.jobTitle = jobTitle;

    }

    public void work() {
        System.out.println(name + " is working now");
    }

    public String toString() {
    return name +" is "+jobTitle+", age  is "+age+", job title is "+jobTitle+", and salary is $"+salary ;

    }


}
