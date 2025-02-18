package Extra;

interface Interface1 {
    // Normal method
    void display();

    // Default method
    default void defaultMethod() {
        System.out.println("Default method in Interface1");
    }

    // Static method
    static void staticMethod() {
        System.out.println("Static method in Interface1");
    }
}

interface Interface2 extends Interface1 {
    // Additional abstract method in Interface2
    void additionalMethod();

    // Overriding default method from Interface1
    @Override
    default void defaultMethod() {
        System.out.println("Default method in Interface2");
    }
}

public class Main implements Interface2 {
    // Implementing abstract methods from Interface2
    @Override
    public void display() {
        System.out.println("Display method in Main class");
    }

    @Override
    public void additionalMethod() {
        System.out.println("Additional method in Main class");
    }

    public static void main(String[] args) {
        Main obj = new Main();

        // Calling methods
        obj.display();
        obj.additionalMethod();

        // Calling default methods from Interface1 and Interface2
        obj.defaultMethod();  // This will call the overridden method in Interface2
        Interface1.staticMethod();
    }
}


/*
Q) in interface2 static method is extends or not ?
ChatGPT

In Java, when an interface extends another interface, it does not inherit the static methods of the parent interface. Static methods in 
interfaces are associated with the interface itself and are not inherited by the interfaces that extend it or the classes that implement them.

In the given example, although Interface2 extends Interface1, the staticMethod is not inherited by Interface2. You still need to call the static 
method using the interface name directly, as shown in the main method:

Interface1.staticMethod();  //<-Like this

This is because static methods in interfaces are meant to be invoked using the interface name, not through an instance of the interface or 
its implementing class.
*/