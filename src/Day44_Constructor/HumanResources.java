package Day44_Constructor;

public class HumanResources {
    static Employee_WarmTask employee1;
    static Employee_WarmTask employee2;
    static Employee_WarmTask employee3;
    static Employee_WarmTask employee4;
    static Employee_WarmTask employee5;

    /*static { //as soon class called, static variables need to be set
            employee1=new Employee_WarmTask();
            employee2=new Employee_WarmTask();
            employee3=new Employee_WarmTask();
            employee4=new Employee_WarmTask();
            employee5=new Employee_WarmTask();

            employee1.SetEmployerInfo("Ahmed", 1, 11, "QA", 10000, 'M');
            employee2.SetEmployerInfo("Alina", 2, 22, "HR", 20000, 'F');
            employee3.SetEmployerInfo("Emilichka", 3,  33, "Child", 30000, 'F');
            employee4.SetEmployerInfo("Lucky", 4, 44, "Dog", 10, 'M');
            employee5.SetEmployerInfo("Gray", 5, 55, "Big dog", 1, 'M');
        }*/
    public static void main(String[] args) {
        employee1=new Employee_WarmTask();
        employee2=new Employee_WarmTask();
        employee3=new Employee_WarmTask();
        employee4=new Employee_WarmTask();
        employee5=new Employee_WarmTask();

        employee1.SetEmployerInfo("Ahmed", 1, 11, "QA", 10000, 'M');
        employee2.SetEmployerInfo("Alina", 2, 22, "HR", 20000, 'F');
        employee3.SetEmployerInfo("Emilichka", 3,  33, "Child", 30000, 'F');
        employee4.SetEmployerInfo("Lucky", 4, 44, "Dog", 10, 'M');
        employee5.SetEmployerInfo("Gray", 5, 55, "Big dog", 1, 'M');
    }

    }


