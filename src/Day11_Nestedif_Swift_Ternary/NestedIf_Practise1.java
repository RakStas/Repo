package Day11_Nestedif_Swift_Ternary;

public class NestedIf_Practise1 {
    public static void main(String[] args) {
       /* Task 1.
        precondition: minimum salary 30k
        sub condition: minimum job history
        */
        int salary = 30000;
        int job_history = 1;
        String result = "";
        if (salary >= 30000) {
            if(job_history>=2) {
                System.out.println("It can be");
            }else {
                System.out.println("You must have been on job at least 2 years");
            }

        } else {
            System.out.println("You mast earn at least $30k");

        }
    }
}
