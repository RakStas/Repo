package Day08_LogcalOperators;

public class practise {
    public static void main(String[] args) {
        String firstName = "Aaron";
        String lastName = "Daniel";
        int age = 19;
        String citizenShip = "UA";
        boolean eligibleToVote = age>=18&&citizenShip=="USA";
        System.out.println(eligibleToVote);

        System.out.println(firstName+" "+lastName+" is eligible to vote: "+eligibleToVote);
        boolean r6 = !true && false;
        boolean r7 = 7>5||5>6;
        System.out.println("r7="+r7);
        System.out.println("==================");
        boolean r8 = true ==!false || false==true;
        System.out.println("r8= "+r8);
        boolean r9 = !false == false|| true ==!false;
        System.out.println("r9= "+r9);
        boolean r10 = !false == false && true==!false;
        System.out.println("r10= "+r10);
    }
}
