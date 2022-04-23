package Day09_If_Statement;

public class mediumNumber {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;
        boolean aIsMed = (a > b && a < c) || (a > c && a < b);
        boolean bIsMed = (b > c && b < a) || (b < c && b > a);
        boolean cIsMed = !aIsMed && !bIsMed;

        double f = 0;
        if (aIsMed) {
            f = a;
        } else{
            System.out.println(a+" isn't medium digit");
        }
        if (bIsMed) {
            f = b;

        }else{
            System.out.println(b+" isn't medium digit");
        }
        if (cIsMed) {
            f = c;
        }
        else{
            System.out.println(c+" isn't medium digit");
        }
        System.out.println(f+" is medium number");
    }
    }