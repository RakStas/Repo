package Day57_OOP_Polymorphism.Employee;

public class Developer extends Employee{
    public Developer(String name, long id, String jobTitle,  int salary, char gender) {
        super(name, id,  jobTitle,  salary, gender);
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
