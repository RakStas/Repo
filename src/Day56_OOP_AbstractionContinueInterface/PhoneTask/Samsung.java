package Day56_OOP_AbstractionContinueInterface.PhoneTask;

public final class Samsung extends Phone{

    public Samsung(String brand, String model, double price, String size) {
        super("Samsung", model, price, size);
        if(price<=0||price>=1200){
            throw new RuntimeException("Invalid price, write new price");
        }

    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Samsung is colling to "+phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Samsung is texting to "+phoneNumber);
    }

    @Override
    public void calling(long num1, long num2) {
        calling(num1);
        calling(num2);
    }

    @Override
    public void texting(long num1, long num2) {
            texting(num1);
            texting(num2);
    }

    public void freezing(){
        System.out.println("Samsung is freezziing? buy new iPhone)) ");
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price $=" + price +
                ", size=" + size +
                '}';
    }
}
