package Day55_OOP_Abstraction_Continue.Shape;

import java.text.DecimalFormat;

public class Shape_Objects {
    public static void main(String[] args) {
        Circle circle=new Circle(-1);
        Rectangle rectangle=new Rectangle(12, 15);
        Cylinder cylinder=new Cylinder(5, 10);
        DecimalFormat df=new DecimalFormat("0.00");

        System.out.println(circle);
        /*System.out.println("=============");
        System.out.println(rectangle);
        System.out.println("-----------------");;
        System.out.println(cylinder);
        System.out.println(cylinder.name);
        System.out.println(cylinder.hasVolume);
        System.out.println("++++++++++++++++");
        System.out.println(df.format(circle.calculateArea()+ cylinder.calculateArea()+ rectangle.calculateArea()));
        System.out.println(df.format(circle.calculatePerimeter()+ cylinder.calculatePerimeter()+ rectangle.calculatePerimeter()));*/


    }
}
