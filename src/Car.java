import com.sun.org.apache.xpath.internal.SourceTree;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 12/11/2016.
 */
public class Car extends Vehicle implements EngineMethods {

    String regNo;
    boolean isTaxed;



    public Car(){
        super();
        this.regNo = "161KY20123";
        this.isTaxed = true;
    }

    public Car(String reg, boolean tax){
        super();
        this.regNo = "161KY20123";
        this.isTaxed = true;
    }


    public String toString(){
        return super.toString() + "\nis taxed? " + this.isTaxed +
                "\nReg: " + this.regNo;
    }

    public void move(){
        System.out.println("driving... ");
    }

    @Override
    public void startEngine() {
        System.out.println("Injecting Fuel and firing cylinders");
    }

    @Override
    public void stopEngine() {
        System.out.println("Cars Engine is stopping");
    }

    @Override
    public String takeFuel(String fueltype){
        return "Taking " + fueltype;
    }
}
