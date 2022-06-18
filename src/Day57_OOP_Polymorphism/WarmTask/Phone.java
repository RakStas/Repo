package Day57_OOP_Polymorphism.WarmTask;

public abstract class Phone {
    public String brand;
    public String model;
    public double price;
    public String size;
    public abstract void texting(long PhoneNumber);
    public abstract void calling(long PhoneNumber);

    public Phone(String brand, String model, double price, String size) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.size = size;

    }
}
