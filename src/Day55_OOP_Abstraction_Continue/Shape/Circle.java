package Day55_OOP_Abstraction_Continue.Shape;

import java.text.DecimalFormat;

public class Circle extends Shape {

    public double radius;

    public Circle(double radius){
        if(radius<=0){
            throw new RuntimeException("Radius of the Circle cannot be negative");
        }
        this.radius=radius;
        area=calculateArea();
        perimeter=calculatePerimeter();
        volume=calculateValue();
    }



    @Override
    public double calculateArea() {

        return Math.pow(radius,2)*Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return 2*radius*Math.PI;
    }

    @Override
    public double calculateValue() {
        return 0;
    }
    static {
        name = "Cicle";
        hasVolume=false;
    }

    @Override
    public String toString() {
        DecimalFormat df=new DecimalFormat("0.00");
        return "Circle{" +
                "radius=" + radius +
                ", area=" + df.format(area) +
                ", perimeter=" + df.format(perimeter) +
                ", volume=" + df.format(volume)+
                '}';
    }
}