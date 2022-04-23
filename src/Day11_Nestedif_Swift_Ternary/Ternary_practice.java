package Day11_Nestedif_Swift_Ternary;

public class Ternary_practice {
    public static void main(String[] args) {

        int num =-10;
        String result=(num>0)?"Positive":(num<0)?"Negative":"Zero";
        System.out.println(result);

        String result2="";
        if(num>0){result2="Positie";
        }else if (num<0){result2="negative";
        }else result2="zero";
        System.out.println(result2);
        System.out.println("==========================");
        int a = 10;
        int b =20;
        String rr=(a>b)?"a is bigger b":(a<b)?"a is smoller b":"a is equal b";
        System.out.println(rr);
    }
}
