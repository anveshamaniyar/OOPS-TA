// File: Main.java (outside the "myPackage" folder)
import myPackage.MyClass;  // Importing the package

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass(); // Creating an object of MyClass
        obj.displayMessage();        // Calling method from the package
    }
}
