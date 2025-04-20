// Parent class
class Animal {
    String name;

    // Constructor
    Animal(String name) {
        this.name = name;
    }

    // Method to display basic animal info
    void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    String breed;

    // Constructor for Dog class (calls parent constructor using super)
    Dog(String name, String breed) {
        super(name); // Calls parent constructor
        this.breed = breed;
    }

    // Overriding makeSound method to provide specific behavior
    @Override
    void makeSound() {
        System.out.println(name + " barks! Breed: " + breed);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of Dog, which inherits Animal
        Dog dog1 = new Dog("Buddy", "Golden Retriever");

        // Calling method from the child class
        dog1.makeSound(); // Overrides parent method
    }
}
