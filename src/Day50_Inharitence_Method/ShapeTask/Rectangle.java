package Day50_Inharitence_Method.ShapeTask;

public class Rectangle extends Shape{
    public double length;
    public double width;
    public double calculateArea(){
        return length*width;
    }
    public double calculatePerimeter(){
        return length*2+width*2;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        area=calculateArea();
        perimeter=calculatePerimeter();
    }
}
