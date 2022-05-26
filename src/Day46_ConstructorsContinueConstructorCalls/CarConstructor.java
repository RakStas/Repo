package Day46_ConstructorsContinueConstructorCalls;

public class CarConstructor {
    String brand;
    String model;
    double price;
    int year;
    String color;

    /*public CarConstructor(String brand, String model, double price, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.year = year;
        this.color = color;
    }*/

    public CarConstructor(String brand) {
        this.brand = brand;
    }
    public CarConstructor(String brand, String model){
        this(brand);
        this.model=model;
    }
    public CarConstructor(String brand, String model, double price){
        this(brand, model);
        this.price=price;
    }
    public CarConstructor(String brand, String model, double price, int year){
        this(brand, model, price);
        this.year=year;
    }
    public  CarConstructor(String brand, String model, double price, int year, String color){
        this(brand, model, price, year);
        this.color=color;
    }


    public String toString() {
        return "Student's car is:" +
                " Brand = " + brand  +
                "; Model = " + model  +
                "; Price = $" + price +
                "; Year = " + year +
                "; Color = " + color+";";
    }
}
