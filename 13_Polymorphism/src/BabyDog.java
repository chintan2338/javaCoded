//Java Runtime Polymorphism with Multilevel Inheritance
class Animal 
{
	void eat() 
	{
		System.out.println("eating");
	}
}

class Dog extends Animal 
{
	void eat() 
	{
		System.out.println("eating fruits");
	}
}

public class BabyDog extends Dog 
{
	void eat() 
	{
		System.out.println("drinking milk");
	}

	public static void main(String args[]) 
	{
//		Animal a1;
//		a1=new Animal();
//		a1.eat();
//		
//		a1=new Dog();
//		a1.eat();
//		
//		a1=new BabyDog();
//		a1.eat();
		
		Animal a1, a2, a3;
		a1 = new Animal();
		a2 = new Dog();
		a3 = new BabyDog();
		a1.eat();
		a2.eat();
		a3.eat();
	}
}