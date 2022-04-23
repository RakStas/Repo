package Day33_Wrapper_Class_ArrayList_Intro;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        String [] d={"100.0", "55.5", "45.2"};
        double next[]=new double[d.length];

        for(int i=0; i<=d.length-1; i++){
        next [i]=Double.parseDouble(d[i]);

        }
        System.out.println(Arrays.toString(next));
        System.out.println("=============");

        String str ="123";
       int a= Integer.parseInt(str);

        System.out.println(str);

        String str1="45";
        float fl=Float.parseFloat(str1);
        System.out.println(fl);

        String s1="true";
        boolean bl=Boolean.parseBoolean(s1);
        System.out.println(bl);











    }
}
