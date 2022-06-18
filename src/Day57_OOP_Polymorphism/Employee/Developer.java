package Day57_OOP_Polymorphism.Employee;

public class Developer extends Employee{
    public Developer(String name, String jobTitle, long id, int salary, char gender) {
        super(name, jobTitle, id, salary, gender);
    }

    @Override
    public void work() {
        System.out.println("Developer "+name+" is working, and create new programs");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
