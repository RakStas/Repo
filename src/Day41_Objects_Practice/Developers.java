package Day41_Objects_Practice;

public class Developers {

    String name;
    double salary;
    String gender;
    int age;

    public void SetInfo(String name, double salary, String gender, int age){
        this.name=name;
        this.salary=salary;
        this.gender=gender;
        this.age=age;
    }
    public String toString(){
        return "Name is "+name+"\nGender is "+gender+"\nSalary is $"+salary+"\nAge is "+age;
    }

    public void coding(){
        System.out.println(name+" is coding");

    }
    public void fixBugs(){
        System.out.println(name+" is tested");
    }
}
    class DeveloperObject{
        public static void main(String[] args) {
            Developers[] dev={new Developers(),new Developers(),new Developers(),new Developers()};
            dev[0].SetInfo("Pavel", 15000, "M", 28);
            dev[1].SetInfo("Oliya", 18000, "F", 29);
            dev[2].SetInfo("Mikola", 1000, "M", 29);
            dev[3].SetInfo("Yana", 25000, "F", 31);

            for (Developers each:dev){
               each.coding();
            }
            System.out.println("===============");

            for (Developers each:dev){
                each.fixBugs();
            }

        }

    }