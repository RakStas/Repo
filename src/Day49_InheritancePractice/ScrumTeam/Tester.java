package Day49_InheritancePractice.ScrumTeam;

public class Tester extends Employee{

       public  Tester(String name,int age,char gender,double salary,int ID, String jobTitle){
        setInfo( name, age,  gender,  salary, ID, jobTitle);
    }
       public void smokeTesting(){
            System.out.println("smoke testing by "+name +" "+jobTitle);
        }
       public void creatingTickets(){
           System.out.println(name+" is creating tickets");
       }

}
