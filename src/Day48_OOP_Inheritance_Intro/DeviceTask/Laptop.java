package Day48_OOP_Inheritance_Intro.DeviceTask;
/*attributes: brand, model, price, MadeIn, hasBattery, hasMemory, screenSize, hasCPU, hasMouse, hasKeyBoard, OS
					methods: coding, watching, setInfo, toString

					add a constructor that can set the fileds*/
public class Laptop extends Device{
    public boolean hasBattery=true;
    public boolean hasSimCard=true;
    public String OS;
    public double screenSize;
    boolean hasCPU=true;
    boolean hasMouse=false;

        public Laptop(String brand, String model, double price,
                      boolean hasBattery, boolean hasMemory, String OS)
        {
            SetInfo(brand, model, price, hasBattery, hasMemory);
            this.OS=OS;
        }




}
