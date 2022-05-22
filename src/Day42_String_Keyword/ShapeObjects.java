package Day42_String_Keyword;

public class ShapeObjects {
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.setInfo(25);
        c1.calcPeremeter();
        c1.calcArea();
        System.out.println(c1.calcArea());
        System.out.println(c1.calcPeremeter());
        System.out.println(c1);

    }
}
