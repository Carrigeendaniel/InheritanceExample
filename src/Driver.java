
public class Driver{

    static Car car1;
    static Bike bike1;

    public static void main(String[] args) {

        createVehicles();
        printInfo();

        Car car2 = createCar();

        Bike bike1 = new Bike();

        //object.method();

        car2.startEngine();

    }

    private static void createVehicles() {
        car1 = new Car();
        bike1 = new Bike();
    }


    private static Car createCar(){
        Car newCar = new Car();
        return newCar;
    }

    private static void printInfo() {

        System.out.println(car1.toString());
        System.out.println("-------------------------------------------");
        System.out.println(bike1.toString());
    }
}
