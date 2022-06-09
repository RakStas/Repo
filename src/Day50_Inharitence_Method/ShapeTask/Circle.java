package Day50_Inharitence_Method.ShapeTask;

public class Circle extends Shape{
    public double radius;
    public double diameter;
    public static double pi=3.14;

    public Circle(double radius){
        this.radius=radius;
        diameter=radius*2;
        area=calculateArea();
        perimeter=calculatePerimeter();

    }

    public double calculateArea(){
        return pi+radius*radius;
    }
    public double calculatePerimeter(){
        return 2*pi+radius;
    }


}
