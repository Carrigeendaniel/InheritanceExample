/**
Superclass has attributes and methods that will and must be inherited by it's subclasses.
 It will contain anything that is common for all the subclasses
 
 AKA Base Class, Parent Class*/

public class Vehicle{

    private int noOfPassenegers;
    private int noOfVehicles;
    private String manufacturer;

    public void accelerate()
    {
        System.out.println("Vehicle is accelerating");
    }
}
