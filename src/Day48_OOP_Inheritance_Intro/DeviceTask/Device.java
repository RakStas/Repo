package Day48_OOP_Inheritance_Intro.DeviceTask;

public class Device {
    public String brand;
    public String model;
    public double price;
    public static String madeIn="USA";
    public boolean hasBattery;
    public boolean hasMemory;

    static {
        String madeIn="China";
    }

    public void SetInfo(String brand, String model, double price,
                        boolean hasBattery, boolean hasMemory)
    {
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.hasBattery=hasBattery;
        this.hasMemory=hasMemory;

    }
    public String toString(){
        return "Brand is "+brand+"\nModel is "+model
                +"\nPrice is "+price
                +"\nMade in  "+madeIn+
                "\nHas Battery? "+hasBattery+
                "\nHas Memory? "+hasMemory;
    }


}
