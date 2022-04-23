package Day06;

public class implicid_explicit {
    public static void main(String[] args) {

        short s1 = 155;
        long l1 = s1; //implicit casting

        int I1 = 300;
        double D1 = I1;

        double d2 = 200;
        int i2 =(int) d2;




        System.out.println(D1);
        long r1 = -500;
        int p1 = (int) r1;
        System.out.println(p1);

    }
}
