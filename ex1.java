// Define a class
class Car {
    // Properties (Instance variables)
    String brand;
    int speed;

    // Constructor
    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method to display car details
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects
        Car car1 = new Car("Tesla", 120);
        Car car2 = new Car("BMW", 150);

        // Calling methods
        car1.displayInfo();
        car2.displayInfo();
    }
}