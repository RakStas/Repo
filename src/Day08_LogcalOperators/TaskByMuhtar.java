package Day08_LogcalOperators;

public class TaskByMuhtar {
    public static void main(String[] args) {

        boolean x =true;
        boolean z = true;
        int v = 20;
        boolean c = x=(v!=10)||(z=false);
        System.out.println(c);
        System.out.println("==============");
        String OutSideWeather="Shinny";
        int Degree = 70;
        boolean ccc = (!(OutSideWeather=="Rainy"||Degree==70));
        System.out.println(ccc);
        System.out.println("=============");



    }
}
