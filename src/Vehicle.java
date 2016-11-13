import java.awt.event.ActionListener;

/**
Superclass has attributes and methods that will and must be inherited by it's subclasses.
 It will contain anything that is common for all the subclasses
 
 AKA Base Class, Parent Class*/

public abstract class Vehicle{

    public int noOfPassenegers;
    public int noOfWheels;
    public String manufacturer;

    public Vehicle(){
        this.noOfPassenegers = 0;
        this.noOfWheels = 0;
        this.manufacturer = "default";
    }

    public void accelerate()
    {
        System.out.println("Vehicle is accelerating");
    }

    public String toString(){
        return "Wheels: " + this.noOfWheels +
                "\nPassengers: " +  this.noOfPassenegers +
                "\nManufacturer: " + this.manufacturer ;
    }

    public abstract void move();
}
