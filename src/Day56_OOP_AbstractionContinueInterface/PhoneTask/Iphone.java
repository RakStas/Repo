package Day56_OOP_AbstractionContinueInterface.PhoneTask;

public final class Iphone extends Phone{


    public Iphone(String brand, String model, double price, String size) {
        super("iPhone", model, price, size);
        if(price<=0||price>=1500){
            throw new RuntimeException("Invalid price, write new price");
        }
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("IPhone is colling to "+phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("IPhone is texting to "+phoneNumber);
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

    public void FaceID(long num1, long num2){
        calling(num1);
        calling(num2);
        System.out.println("Only iPhone can call with using FaceTime)) Be happy! ");
    }

}
