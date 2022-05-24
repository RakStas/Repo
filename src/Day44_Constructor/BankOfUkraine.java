package Day44_Constructor;

import java.util.ArrayList;
import java.util.Arrays;
//import static Day44_Constructor.HumanResources.*;
public class BankOfUkraine {



    public static void main(String[] args) {
        ArrayList<Employee_WarmTask>list=new ArrayList<>();
            list.addAll(Arrays.asList(
                    HumanResources.employee4,
                    HumanResources.employee5,
                    HumanResources.employee2,
                    HumanResources.employee1,
                    HumanResources.employee3));

        System.out.println("Size of employee is "+list.size());
        System.out.println("=============");
        for(Employee_WarmTask each:list){
            System.out.println(each.name+" : "+each.salary);
        }


    }
}
