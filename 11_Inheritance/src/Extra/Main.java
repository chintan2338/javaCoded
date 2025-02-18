package Extra;

class Animal {
    static void printInfo() {
        System.out.println("This is an animal.");
    }
}
class Dog extends Animal {
    // Hum yahaan ek static method define karte hain, par ye Animal class ke static method ko override nahi karta.
    static void printInfo() {
        System.out.println("This is a dog.");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal.printInfo(); // Output: This is an animal.
        Dog.printInfo();    // Output: This is a dog.
    }
}


/*
means static metod inheritance me participate nahi kar sakate ? explain me in hinglish
ChatGPT

Static methods inheritance mein participate karte hain, lekin wo polymorphism mein nahi participate karte jaise ki instance methods 
karte hain. Inheritance ke through subclasses ko unke superclass ke static methods ka access hota hai, lekin subclasses unhe override 
nahi kar sakti. Balki, agar ek subclass ek static method ko same signature ke saath declare karta hai jaise ki superclass ke static method ka,
 to wo superclass ke method ko hide kar deta hai, override nahi karta.

Toh, seedhe shabdon mein kaha jaye toh, static methods inheritance mein shaamil hote hain, lekin traditional taur par override nahi kiya 
ja sakta. Balki, agar subclass ek static method ko same signature ke saath dubara declare karta hai jaise ki superclass ke static method ka, 
to wo superclass ke method ko chhupata hai. Ye behavior kabhi-kabhi confusion create kar sakta hai, lekin ye ek zaroori pehlu hai static methods 
ke kaam karne ka object-oriented programming languages mein.
 */