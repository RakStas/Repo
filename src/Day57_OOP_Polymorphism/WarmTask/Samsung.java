package Day57_OOP_Polymorphism.WarmTask;

public class Samsung  extends Phone implements AndroidApp{
    public Samsung(String brand, String model, double price, String size) {
        super("Samsung", model, price, size);
        if(price<0||price>1200){
            throw new RuntimeException("Samsung! Invalid price");
        }
    }

    @Override
    public void download() {
        System.out.println("Open "+AppStoreName+" and make choice to use program");
    }

    @Override
    public void texting(long PhoneNumber) {
        System.out.println("Texting to: "+PhoneNumber);
    }

    @Override
    public void calling(long PhoneNumber) {
        System.out.println("Calling to: " +PhoneNumber);
    }
    public static  void freezing() {
        System.out.println("Your phone is freezing");

    }



    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
