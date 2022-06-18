package Day57_OOP_Polymorphism.WarmTask;

public class Iphone extends Phone implements AppleApp{


    public Iphone(String brand, String model, double price, String size) {
        super("Iphone", model, price, size);
        if(price<0||price>1500){
            throw new RuntimeException("Iphone! Invalid price");
        }
    }

    @Override
    public void download() {
        System.out.println("Open Apple Store, and make choice to use program from: "+AppStoreName);
    }

    @Override
    public void texting(long PhoneNumber) {
        System.out.println("Texting to: "+PhoneNumber);
    }

    @Override
    public void calling(long PhoneNumber) {
        System.out.println("Calling to: " +PhoneNumber);
    }
    public void FaceTime(long PhoneNumber){
        System.out.println("We are calling by FaceTime to:" +PhoneNumber);
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
