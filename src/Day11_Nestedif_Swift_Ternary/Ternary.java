package Day11_Nestedif_Swift_Ternary;

public class Ternary {
    public static void main(String[] args) {
        int a=100;
        String b= "";
        if(a%2==0){b="Even";
        }else {
            b="Odd";
        }
        System.out.println(b);
        System.out.println("============");

        String result2 = (a%2==1)?"Even":"Odd";
        System.out.println(result2);
        System.out.println("==============");
        int num1 =100;
        int num2=200;
        int max1=0;
        if (num1>num2){max1=num1;
        }else {max1=num2;

        }
        System.out.println(max1);
        int max2=(num1>num2)? num1 : num2;
        System.out.println(max2);
        int num5 = 20;
        int num6 = 50;
        int max3=(num5>num6)?num5:num6;

        System.out.println(max3);
        System.out.println("==============");
        String can = "";
        int age = 5;
        boolean eligible = false;
        if (age<21){eligible=true;
        }else eligible=false;

        boolean eligiable2=(age>=21)?true:false;
        System.out.println(eligiable2);






    }
}
