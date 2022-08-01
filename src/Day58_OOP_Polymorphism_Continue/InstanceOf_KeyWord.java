package Day58_OOP_Polymorphism_Continue;

import Day55_OOP_Abstraction_Continue.Shape.Circle;
import Day55_OOP_Abstraction_Continue.Shape.Cylinder;
import Day55_OOP_Abstraction_Continue.Shape.Rectangle;
import Day55_OOP_Abstraction_Continue.Shape.Shape;
import Day58_OOP_Polymorphism_Continue.WarmTask.Animal;
import Day58_OOP_Polymorphism_Continue.WarmTask.Cat;
import Day58_OOP_Polymorphism_Continue.WarmTask.Dog;

public class InstanceOf_KeyWord {



    public static boolean equalShape(Shape shape1, Shape shape2){

         boolean result=false;
         boolean bothCircle=shape1 instanceof Circle && shape2 instanceof Circle;
         boolean bothRectangle= shape1 instanceof Rectangle && shape2 instanceof  Rectangle;
        boolean bothCylinder=shape1 instanceof Cylinder&& shape2 instanceof Cylinder;

         if(bothCircle){
             Circle c1 = (Circle)shape1;
             Circle c2 = (Circle) shape2;
             if (c1.radius==c2.radius){
                 result=true;
             }
         }
         if(bothRectangle){
             Rectangle r1=(Rectangle)shape1;
             Rectangle r2=(Rectangle)shape2;
            if(r1.area==r2.area){
                result=true;
            }


         }
         if(bothCylinder){
             Cylinder cc1=(Cylinder) shape1;
             Cylinder cc2=(Cylinder) shape2;
             if(cc1.radiusCylinder==cc2.radiusCylinder&&cc1.heightCylinder==cc2.heightCylinder);
                result =true;
         }
         return  result;
        }




    public static void main(String[] args) {
        /*Animal animal = new Animal(5, 'F');
        Animal animal2 = new Dog("Pes", 5, 'm');
        Animal animal3 = new Cat("Kot", 4, 'm');

        if(animal3 instanceof Animal){
            System.out.println("its Cat");
        }else {
            System.out.println("Its not cat");
        }
         boolean r1 = animal3 instanceof Animal; //true
        System.out.println(r1);
        boolean r2 = animal3 instanceof Cat; //true
        System.out.println(r2);
        boolean r3 = animal3 instanceof Dog; //false
        System.out.println(r3);
        boolean r4 = animal instanceof Animal; //true
        System.out.println(r4);
        boolean r5 = animal instanceof Dog; //false
        System.out.println(r5);*/

        Circle c1 = new Circle(5);
        Circle c2 = new Circle(5);
        System.out.println(equalShape(c1, c2));

        Rectangle r1= new Rectangle(5, 4);
        Rectangle r2= new Rectangle(4, 4);
        System.out.println(equalShape(r1, r2));

        Cylinder cylinder=new Cylinder(5, 8);
        Cylinder cylinder1=new Cylinder(5, 8);
        System.out.println(equalShape(cylinder, cylinder1));


        /*Shape shape1=new Circle(25) ;
        public static void identifyShape(Shape shape){
            if (shape instanceof Circle) {
                System.out.println("Its Circle");
            } else if (shape instanceof Cylinder) {
                System.out.println("Its Circle");
            } else if (shape instanceof Rectangle) {
                System.out.println("Its rectangle");*/
            }
        }






