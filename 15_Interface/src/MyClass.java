// Interface definition
interface MyInterface {
    // Public method
    void publicMethod();

    // Default method
    default void defaultMethod() {
        System.out.println("Default implementation of defaultMethod");
    }

    // Static method
    static void staticMethod() {
        System.out.println("Static method in MyInterface");
    }
}

// Implementing class
public class MyClass implements MyInterface {
    @Override
    public void publicMethod() {
        System.out.println("Override publicMethod in MyClass");
    }

    // Default method override
    @Override
    public void defaultMethod() {
        System.out.println("Override defaultMethod in MyClass");
    }

    // Static method override
    public static void staticMethod() {
        System.out.println("Override staticMethod in MyClass");
    }

    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        // Calling overridden methods
        myObject.publicMethod();
        myObject.defaultMethod();

        // Calling static method through class name
        MyInterface.staticMethod();
        
        // Calling overridden static method
        MyClass.staticMethod();
    }
}

/*
1. Default Method Override:
Default method ko override karne ke liye aapko usi naam 
ke method ko implementing class mein likhna hoga. 
Agar aap chahein toh is method mein kuch alag 
functionality add kar sakte hain ya fir default 
implementation ko hi use kar sakte hain.

2. Static Method Override:
Static method ko override karne ka concept thoda alag 
hai. Static methods interface ke instance se associated 
nahi hote, isliye aap unhein instance level par
override nahi kar sakte. Instead, aapko ek alag static 
method define karna hoga, jo ki interface ke static 
method ko call kare.

->Jab aap ek static method ko subclass mein same naam aur signature ke saath define karte hain, toh woh 
actually superclass ke static method ko "hide" kar deta hai, lekin yeh hide karne ka process hai, override 
nahi.

Jab aap static method ko override karte hain, aapko 
@Override annotation ka use nahi karna padta, kyun ki 
static methods inheritance ke through nahi aate hain, 
balki class ke saath associated hote hain.
*/