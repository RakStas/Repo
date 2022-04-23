package Day12_Switch_Scanner;

public class Bigger_Number {
    public static void main(String[] args) {

        double n1=300;
        double n2=2;
        double n3=1000;

        boolean n1Bigger=n1>n2&&n1>n3;
        boolean n2Bigger=n2>n1&&n2>n3;

        String result = (n1Bigger)?"n1 is bigger":(n2Bigger)?"n2 is bigger":"n3 is bigger";

        /*if(n1Bigger){result="n1 is bigger";
        } else if (n2Bigger){result="n2 is bigger";
        } else {result="n3 is bigger";}
        */


        System.out.println(result);

    }

}
