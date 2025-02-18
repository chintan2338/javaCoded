package Extra;

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String name, String breed) {
        super(name); // Calling superclass constructor
        this.breed = breed;
    }

    public void displayDetails() {
        System.out.println("Name: " + super.name); // Accessing superclass variable
        super.makeSound(); // Calling superclass method
        System.out.println("Breed: " + breed);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Labrador");
        myDog.displayDetails();
    }
}