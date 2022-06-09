package Day55_OOP_Abstraction_Continue.Shape;



public abstract class Shape {

    public static String name;
    public double area;
    public double perimeter;
    public static boolean hasVolume;
    public double volume;



    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public abstract double calculateValue();


}
