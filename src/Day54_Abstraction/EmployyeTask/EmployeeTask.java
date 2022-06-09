package Day54_Abstraction.EmployyeTask;

import java.time.LocalDate;

public class EmployeeTask {
    public String name;
    final public char gender;
    final public LocalDate DoBr;
    public String jobTitle;
    public double salary;

    public EmployeeTask(String name, char gender, LocalDate doBr, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        DoBr = doBr;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
}
