package Day57_OOP_Polymorphism.Employee;

public class Tester extends Employee{
    public Tester(String name, String jobTitle, long id, int salary, char gender) {
        super(name, jobTitle, id, salary, gender);
    }

    @Override
    public void work() {
        System.out.println("Tester "+name+" is working, and find buds");
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
