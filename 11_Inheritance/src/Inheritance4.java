//Multi-level Inheritance
/*
class Demo1
{
	void disp()
	{
		System.out.println("Disp written in demo1 class");
	}
}
class Demo2 extends Demo1
{
	
}
class Demo3 extends Demo2
{
	
}
public class Inheritance4 {

	public static void main(String[] args) 
	{
		Demo3 d=new Demo3();
		d.disp();
	}

}
*/

//Hirarchical inheritance 
/*
class Animal //extends Object
{
	void sleep()
	{
		System.out.println("Animal need sleep");
	}
}
class Tiger extends Animal
{
	
}
class Monkey extends Animal
{
	
}
class Deer extends Animal
{
	
}
public class Inheritance4 {

	public static void main(String[] args) 
	{
		Tiger t=new Tiger();
		t.sleep();

	}

}
*/


//Multiple inheritance
/*
class Parent1 //extends Object
{
	int age=18;
}
class Parent2 //extends Object
{
	int age=19;
}
class Child extends Parent1 //,Parent2  //<-- error
{
	
}
public class Inheritance4 {

	public static void main(String[] args) 
	{
		
	}

}
*/

//Extra on inheritance
/*
class Animal //extends Object
{
	void sleep()
	{
		System.out.println("Animal need sleep");
	}
}
class Tiger extends Animal
{
	
}
class Monkey extends Animal
{
	
}
class Deer extends Animal
{
	
}
public class Inheritance4 {

	public static void main(String[] args) 
	{
		Tiger t=new Tiger();
		t.sleep();
		
		Animal a=new Animal();
		a.  //a. કરતાં ગણાબધા method દેખાશે. જે Object class માંથી inherit થયા છે. 

	}

}
*/