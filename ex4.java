// Defining an interface
interface Vehicle {
    void start();  // Abstract method (must be implemented by classes)
    void stop();
}

// Implementing the interface in a class
class Car implements Vehicle {
    String brand;

    Car(String brand) {
        this.brand = brand;
    }

    // Providing implementation for interface methods
    @Override
    public void start() {
        System.out.println(brand + " is starting.");
    }

    @Override
    public void stop() {
        System.out.println(brand + " has stopped.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of Car
        Car car1 = new Car("Tesla");

        // Calling interface methods
        car1.start();
        car1.stop();
    }
}
