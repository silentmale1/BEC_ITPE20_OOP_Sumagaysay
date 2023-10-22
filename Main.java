class Vehicle {
    private String brand;
    private String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void start() {
        System.out.println("Vehicle is starting.");
    }

    public void stop() {
        System.out.println("Vehicle is stopping.");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, String model, int numDoors) {
        super(brand, model); // Call the base class constructor to initialize brand and model
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void honk() {
        System.out.println("Car is honking!");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 4);

        System.out.println("Car brand: " + myCar.getBrand());
        System.out.println("Car model: " + myCar.getModel());
        System.out.println("Number of doors: " + myCar.getNumDoors());

        myCar.start();
        myCar.honk();
        myCar.stop();
    }
}
