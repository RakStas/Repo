package Day09_If_Statement;

public class minimal {
    public static void main(String[] args) {
        int a=5;
        int b=5;
        int c=8;
        boolean min1=a<b&&a<c;
        boolean min2=min1==false&&b<c;
        boolean min3=min1==false&&min2==false;
        int str=0;

        if (min1){
            str=a;
        }
        if (min2){
            str=b;
        }
        if (min3){
            str=c;
        }
        System.out.println(str+" is minimal");

    }
}
