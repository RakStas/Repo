package Day39_Custom_Class;

public class Employee {
    String name;
    char gender;
    int ID;
    String jobTitle;
    int salary;
    int SNN;


    public void setEmployeeInfo(String employeename, char employeeGender, int employeeID, String employeeJobTitle,
                                int employeeSalary, int employeeSNN){
        name=employeename;
        gender=employeeGender;
        ID=employeeID;
        jobTitle=employeeJobTitle;
        salary=employeeSalary;
        SNN=employeeSNN;


    }
    public void getEmloyee(){
        System.out.println("Name: "+name+"; Gender: "+gender+"; Bank ID: "+ID+"; Salary: $"+salary);
        String snn=""+SNN;
        System.out.println("Last four digit of SNN: "+snn.substring(snn.length()-4)+"; Job Title: "+jobTitle);

    }
}
