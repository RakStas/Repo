package Day50_Inharitence_Method.ShapeTask;

public class ShapeOfObjects {
    public static void main(String[] args) {
        Circle circle=new Circle(5);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());

        System.out.println("============");
        Rectangle rectangle=new Rectangle(8, 5);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

    }

}
