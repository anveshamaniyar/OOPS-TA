class Vehicle {
    String type;
    int speed;

    // Constructor Overloading
    Vehicle() {  // Default Constructor
        this.type = "Unknown";
        this.speed = 0;
        System.out.println("Default constructor called.");
    }

    Vehicle(String type) {  // Parameterized Constructor (1 argument)
        this.type = type;
        this.speed = 50;
        System.out.println("Parameterized constructor called: Type set.");
    }

    Vehicle(String type, int speed) {  // Parameterized Constructor (2 arguments)
        this.type = type;
        this.speed = speed;
        System.out.println("Parameterized constructor called: Type & Speed set.");
    }

    // Method to display vehicle details
    void displayInfo() {
        System.out.println("Vehicle Type: " + type + ", Speed: " + speed + " km/h");
    }

    // Destructor-like behavior using finalize()
    @Override
    protected void finalize() {
        System.out.println("Object is being destroyed: " + type);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects using overloaded constructors
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle("Car");
        Vehicle v3 = new Vehicle("Bike", 80);

        v1.displayInfo();
        v2.displayInfo();
        v3.displayInfo();

        // Explicitly suggesting garbage collection (not guaranteed)
        v1 = null;
        v2 = null;
        System.gc();  // Calls finalize() when GC runs

        System.out.println("Program execution completed.");
    }
}
