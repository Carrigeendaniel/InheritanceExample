/**
 * 12/11/2016.
 */
public class ElectricCar extends Vehicle implements EngineMethods{


    @Override
    public void move() {
        System.out.println("Driving...");
    }

    @Override
    public void startEngine() {
        System.out.println("starting software");
    }

    @Override
    public void stopEngine() {
        System.out.println("Shutting down software");
    }

    @Override
    public String takeFuel(String fueltype) {
        return null;
    }
}
