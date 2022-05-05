package Day39_Custom_Class;

public class Car {
    String brand;
    String  color;
    double price;
    String model;
    int year;
    double mileage;

    public void  carInfo(String carBrand, String carModel, String carColor,
                        double carPrice,  int carYear, double carMileage){
        brand=carBrand;
        model=carModel;
        color=carColor;
        price=carPrice;
        year=carYear;
        mileage=carMileage;

    }
    public  void setCarInfo(int caryear, ){

    }

}
