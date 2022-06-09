package Day48_OOP_Inheritance_Intro.DeviceTask;
/*attributes: brand, model, price, MadeIn, screenSize, hasBattery, hasMemory, hasSimCard, OS
					methods: call, text, setInfo, toString

					add a constructor that can set the fileds*/
public class Phone extends Device{
    public boolean hasBattery=true;
    public boolean hasSimCard=true;
    public String OS;
    public void Call(long phoneNumber){

        System.out.println("Calling "+phoneNumber);
    }
    public void Text(long phoneNumber){
        System.out.println("Can write text in messengers "+phoneNumber);
    }
    public Phone(String brand, String model, double price,
                 boolean hasBattery, boolean hasMemory, String OS) {
        SetInfo( brand,  model,  price,
                hasBattery,  hasMemory );
    this.OS=OS;
    }

}
