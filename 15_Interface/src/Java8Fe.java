//Java 8 Features
/*
interface A
{	
	//public method
	void show();//public,abstract
	
	//default method 
	default void config()//yaha per default ek keyword hai access modifier nahi.
	{
		System.out.println("in config");
	}
	
	//static method //static mehtod inheritance me participate nahi kareate wo interface tak simit rahete hai.
	static void abc()//static bhi access modifier nahi hai ye only keyword hai.
	{
		System.out.println("in abc");
	}
}
class B implements A
{
	@Override
	public void show()
	{
		System.out.println("in show");
	}
}
public class Java8Fe {

	public static void main(String[] args) 
	{
		A.abc();
		A obj=new B();
		obj.show();
		obj.config();

	}

}
*/