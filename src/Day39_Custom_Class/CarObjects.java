package Day39_Custom_Class;

public class CarObjects {
    public static void main(String[] args) {

        Car car1=new Car();
        /*car1.brand="toyota";
        car1.model="corola";
        car1.year=1970;
        car1.color="Yellow";
        car1.mileage=5000;
        car1.price=1000000;*/
        car1.carInfo("Volvo", "s40", "Black", 21000, 2022, 5000);
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.color);
        System.out.println(car1.price);

        System.out.println("=========================");
        Car car2=new Car();
        car2.carInfo("Mersedes", "s550", "Black", 50000, 2022, 40.9);
        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.model);
        System.out.println(car2.color);
        System.out.println(car2.price);
        System.out.println(car2.year);
        System.out.println(car2.mileage);


        Car car3=new Car();
        car3.carInfo("Audi", "A8", "Yellow", 20000, 2021, 5000);
        Car car4=new Car();
        car4.carInfo("Jeep", "Wrangler", "Blue", 40000, 2019, 40000);

            car3.setCarInfo();
            car4.setCarInfo();





    }
}
