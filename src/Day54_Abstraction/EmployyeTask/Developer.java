package Day54_Abstraction.EmployyeTask;

import java.time.LocalDate;

public final class Developer extends EmployeeTask{

        public Developer(String name, char gender, LocalDate doBr, String jobTitle,
                      double salary) {
            super(name, gender, doBr, jobTitle, salary);
        }

    @Override
    public String toString() {
        return "Developer{" +
                "Name='" + name + '\'' +
                ", Gender=" + gender +
                ", Date of Birth=" + DoBr +
                ", Job Title='" + jobTitle + '\'' +
                ", Salary=" + salary +
                '}';
    }
}
