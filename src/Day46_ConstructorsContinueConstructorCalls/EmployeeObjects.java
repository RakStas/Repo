package Day46_ConstructorsContinueConstructorCalls;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1=new Employee("Alina");

        System.out.println(employee1);
        System.out.println("===============");
        Employee employee2=new Employee("Stanislav", "QA");
        System.out.println(employee2);
        System.out.println("===============");
        Employee employee3=new Employee("Emilia", "SDET", 19620);
        System.out.println(employee3);
        System.out.println("===============");
        Employee employee4=new Employee("Lucky", "DEV", 19620, 25000);
        System.out.println(employee4);


        ArrayList<Employee>list1=new ArrayList<>();

        ArrayList<Employee>list2=new ArrayList<>(list1);

        ArrayList<Integer>list3=new ArrayList<>( Arrays.asList(1,2,3,5,6));


    }
}
