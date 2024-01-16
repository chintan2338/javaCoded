//final class can not participate in inheritance.
/*
final class Animal1
{
	void sleep()
	{
		System.out.println("Animal is sleeping");
	}
}
class Tiger1 extends Animal1
{
	
}
public class FinalK
{
	public static void main(String []args)
	{
		Tiger1 t=new Tiger1();
		t.sleep();
	}
}
*/
//OR
//if we declare method as final then that method can't override in child class.
/*
class Animal1
{
	final void sleep()
	{
		System.out.println("Animal is sleeping");
	}
}
class Tiger1 extends Animal1
{
//	void sleep()
//	{
//					//-->final method cannot override in child class 
//	}
}
public class FinalK
{
	public static void main(String []args)
	{
		Tiger1 t=new Tiger1();
		t.sleep();
	}
}
*/


//OR


class Animal1
{
	final int age=19;
	final void sleep()
	{
		//age=20;  -->the value of final variabe cannot change. 
		System.out.println("Animal is sleeping");
	}
}
class Tiger1 extends Animal1
{
//	void sleep()
//	{
//					-->final method cannot override in child class 
//	}
}
public class FinalK
{
	public static void main(String []args)
	{
		Tiger1 t=new Tiger1();
		t.sleep();
	}
}

