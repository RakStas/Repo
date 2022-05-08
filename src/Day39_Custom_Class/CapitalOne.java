package Day39_Custom_Class;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {
        Employee employee1=new Employee();
        Employee employee2=new Employee();
        Employee employee3=new Employee();
        Employee employee4=new Employee();
        Employee employee5=new Employee();

        employee1.setEmployeeInfo("Stanislav", 'M', 19620, "QA",
                20000, 55995  );
        employee2.setEmployeeInfo("Alina", 'F', 19620, "Designer",
                25000, 963696  );
        employee3.setEmployeeInfo("Emilichka", 'F', 19620, "Child",
                250000, 140520  );
        employee4.setEmployeeInfo("Lucky", 'M', 19620, "Dog",
                0, 300696  );
        employee5.setEmployeeInfo("Kot", 'M', 5592, "Pussy",
                2, 140365  );
        ArrayList<Employee>list=new ArrayList<>();
        list.addAll(Arrays.asList(employee1,employee2,employee3,employee4,employee5 ));
        for(Employee each: list){
            each.getEmloyee();
            System.out.println();
        }
        System.out.println();
        int max=Integer.MIN_VALUE;
        String name ="";
        for(Employee each:list){
            int eachSalar=each.salary;
            if(each.salary>max){
                max=eachSalar;
                name= each.name;
            }
        }
        System.out.println("Maxumum salary is "+max+", and get is salary "+name);
        System.out.println();
        list.removeIf(p->p.salary<20000);
        for(Employee each:list){
            System.out.println(each.name+" "+each.salary);
        }











    }
}
