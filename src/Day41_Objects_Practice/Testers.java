package Day41_Objects_Practice;

public class Testers {
    String name;
    double salary;
    String gender;
    int age;
public void setInfo(String name,double salary, String gender, int age){
    this.name=name;
    this.salary=salary;
    this.gender=gender;
    this.age=age;
}

    public String toString(){
    return name+" is tester"+"\nSalary is "+salary;
    }
}
class TestersObject{
    public static void main(String[] args) {
        Testers[] testers={new Testers(), new Testers(),new Testers(),new Testers(),new Testers()};
        testers[0].setInfo("Oleg", 1200, "Male", 125);
        testers[1].setInfo("Oleg1", 2200, "Male", 225);
        testers[2].setInfo("Oleg2", 3200, "Male", 325);
        testers[3].setInfo("Oleg3", 4200, "Male", 425);
        testers[4].setInfo("Oleg4", 5200, "Male", 525);
    for(Testers each:testers){
        System.out.println(each);
        System.out.println();
    }

    }

}