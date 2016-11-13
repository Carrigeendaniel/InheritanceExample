/**
 * 12/11/2016.
 */
public class Bike extends Vehicle {
    //--------Attributes--------//
    public String color;
    public boolean hasBell;


    //--------Methods--------//
    public Bike(){
        super();
        this.color="red";
        this.hasBell=true;
    }

    public String toString(){
        return  super.toString() + "\nColor is " + this.color +
                "\nBike has a bell: " + this.hasBell;
    }

    public void move(){
        System.out.println("cycling... ");
    }

    public void doBikeThings() {

    }
}
