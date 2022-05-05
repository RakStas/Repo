package Day39_Custom_Class;

public class CarMax {
    public static void main(String[] args) {
        Car car1=new Car();
        Car car2=new Car();
        Car car3=new Car();
        Car car4=new Car();
        Car car5=new Car();
        car1.carInfo("Izusu", "Bogdan", "Yellow",
                2000, 2005, 10000);
        car2.carInfo("Lada", "Bogdan", "Yellow",
                20, 1975, 190000);
        car3.carInfo("Moskvich", "Fuflo", "Govno",
                2, 1960, 1);
        car1.setCarInfo();
        car2.start();
        car3.start();
    }
}
