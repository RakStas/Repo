package Day48_OOP_Inheritance_Intro.DeviceTask;

public class TV extends  Device{
    public boolean hasRemoteControl;
    public TV(String brand, String model, double price,
              boolean hasBattery, boolean hasMemory, boolean hasRemoteControl ) {
        SetInfo( brand,  model,  price,
         hasBattery,  hasMemory  );
        this.hasRemoteControl=hasRemoteControl;
    }

    public void Watch(){
        System.out.println("You are watching TV"+brand+" "+model);
    }




}
