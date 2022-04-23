package Day11_Nestedif_Swift_Ternary;

public class Ternary_Task_2 {
    public static void main(String[] args) {
        int age=3;
        String citizen = "USA";
        String result="";


        if(age>=18&&citizen=="USA"){result="Can Vote";
        }else result="cannt go vote. stay at home";
        System.out.println(result);
        String result2=(age>=18&&citizen=="USA")?"Can":"NO";
        System.out.println(result2);
        System.out.println("==========================");
        int n1=100;
        int n2=200;
        String r=(n1==n2)?"Equal":"No Equal";
        System.out.println(r);
        System.out.println("==========================");



    }
}
