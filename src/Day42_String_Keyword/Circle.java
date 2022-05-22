package Day42_String_Keyword;

public class Circle {
    double radius;
    double diameter;
    static double pi=3.14;

    public void setInfo(double radius){
        this.radius=radius;
        diameter=2*radius;

    }
    public double calcArea(){
        return radius*radius*pi;
        }
        public  double calcPeremeter(){
        return diameter*pi;
     }
    public String toString(){
        return "Radius of circle is "+radius+"; Area is "+calcArea()+"; Perimeter of area is "+calcPeremeter()+";";
    }
}
