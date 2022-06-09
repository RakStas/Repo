package Day55_OOP_Abstraction_Continue.Shape;

import java.text.DecimalFormat;

public class Cylinder extends Shape{

    public double radiusCylinder;
    public double heightCylinder;

    public Cylinder(double radiusCylinder, double heightCylinder) {
        if(radiusCylinder<0||heightCylinder<=0){
            throw new RuntimeException("Radius and height of the Cylinder cannot be negative");
        }
        this.radiusCylinder = radiusCylinder;
        this.heightCylinder = heightCylinder;
        super.area=calculateArea();
        super.perimeter=calculatePerimeter();
        super.volume=calculateValue();
    }

    @Override
    public double calculateArea() {

        return Math.pow(radiusCylinder,2)*Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return 2*radiusCylinder*Math.PI;
    }

    @Override
    public double calculateValue() {
        return (Math.pow(radiusCylinder,2)*Math.PI)*heightCylinder;
    }
    static {
        name = "Cylinder";
        hasVolume=true;
    }

    @Override
    public String toString() {
        DecimalFormat df=new DecimalFormat("0.00");
        return "Cylinder{" +
                "radiusCylinder=" + radiusCylinder +
                ", heightCylinder=" + heightCylinder +
                ", area=" + df.format(area) +
                ", perimeter=" + df.format(perimeter) +
                ", volume=" + df.format(volume) +
                '}';
    }
}
