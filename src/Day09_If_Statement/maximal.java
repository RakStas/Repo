package Day09_If_Statement;

public class maximal {
    public static void main(String[] args) {

        int a = 1000;
        int b = 6000;
        int c = 0;
        boolean max1 = a > b && a > c;
        boolean max2 = b>a &&b > c;
        boolean max3 = c>a&&c>b;
        double str = 0;
        String yes = " is a bigger number";
        String no = " isn't a bigger number";
        if (max1==true) {
            str=a;
        }
        if (max2==true) {
            str=b;
        }
        if (max3==true) {
            str = c;
        }
        System.out.println(str+" is bigger");
    }
}
