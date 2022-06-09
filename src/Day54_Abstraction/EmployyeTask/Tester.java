package Day54_Abstraction.EmployyeTask;

import java.time.LocalDate;

public final class Tester extends EmployeeTask{
    public Tester(String name, char gender, LocalDate doBr, String jobTitle,
                  double salary) {
        super(name, gender, doBr, jobTitle, salary);
    }
    public String toString() {
        return "Tester{" +
                "Name='" + name + '\'' +
                ", Gender=" + gender +
                ", Date of Birth=" + DoBr +
                ", Job Title='" + jobTitle + '\'' +
                ", Salary=" + salary +
                '}';
    }

}
