// Generic class
class Box<T> {  // T is a placeholder for any data type
    private T item;

    // Constructor
    Box(T item) {
        this.item = item;
    }

    // Generic Method to display item
    void displayItem() {
        System.out.println("Stored item: " + item);
    }

    // Getter method
    T getItem() {
        return item;
    }
}

public class Main {
    // Generic Method
    static <U> void printData(U data) {
        System.out.println("Printing: " + data);
    }

    public static void main(String[] args) {
        // Using Generic Class with different data types
        Box<Integer> intBox = new Box<>(100);
        Box<String> strBox = new Box<>("Hello Generics");

        intBox.displayItem();  // Output: Stored item: 100
        strBox.displayItem();  // Output: Stored item: Hello Generics

        // Calling generic method
        printData(42);           // Output: Printing: 42
        printData("Java Rocks"); // Output: Printing: Java Rocks
    }
}
