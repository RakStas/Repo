package Day55_OOP_Abstraction_Continue.Shape;

import java.text.DecimalFormat;

public class Rectangle extends Shape{
    double length;
    double  width;

    public Rectangle(double length, double width){
        if(length<=0||width<=0){
            throw new RuntimeException("Length and width of the rectangle cannot be negative");
        }
        this.length=length;
        this.width=width;
        area=calculateArea();
        perimeter=calculatePerimeter();
        volume=calculateValue();
    }




    @Override
    public double calculateArea() {
        return length*width ;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(length+width);
    }

    @Override
    public double calculateValue() {
        return 0;
    }
    static {
        name = "Rectangle";
        hasVolume=false;
    }

    @Override
    public String toString() {
        DecimalFormat df=new DecimalFormat("0.00");
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + df.format(area) +
                ", perimeter=" + df.format(perimeter) +
                ", volume=" + df.format(volume)+
                '}';
    }
}
