package Day54_Abstraction.AbstractCar;

public class Jeep extends AbstractCar {

    @Override
    public void start() {
        System.out.println("Check oil level, and fuel level");
    }
}
