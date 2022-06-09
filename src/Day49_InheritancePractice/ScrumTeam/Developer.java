package Day49_InheritancePractice.ScrumTeam;

public class Developer extends Employee {

    public Developer(String name, int age, char gender, int salary, int ID, String jobTitle) {
        setInfo(name, age, gender, salary, ID, jobTitle);

    }
    public void coding(){
        System.out.println(name +" "+jobTitle+" now is coding");
    }
    public void fixBugs(){
        System.out.println(name +" "+jobTitle+" now is fixing bugs");
    }


}
