package Day57_OOP_Polymorphism.Employee;

public abstract class Employee {
public String name, jobTitle;
    public long id;
    public int salary;
    public char gender;
    public abstract void work();

    public Employee(String name, String jobTitle, long id, int salary, char gender) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
