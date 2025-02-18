//3.interface implements
/*
interface A
{
	void show();
}
class B implements A
{
	public void show()
	{
		System.out.println("in show");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		A obj=new B();
		obj.show();
		
		//A obj=new A();-->interface નો object ના બનાવી શકાય
	}

}
*/

//OR

/*
interface A
{
	void show();
}
interface x 
{
	void abc();
}
class B implements A,x
{
	public void show()
	{
		System.out.println("in show");
	}
	public void abc()
	{
		System.out.println("in abc");
	}
}
public class Demo1 {

	public static void main(String[] args) {
//		A obj=new B();
//		obj.show();
//		obj.abc();//-->error
		
		B obj=new B();
		obj.show();
		obj.abc();
	}

}
*/
//OR
/*
interface A
{
	void show();
}
interface x extends A  //-->interface ne પણ extends કરી શકાય છે.
{
	void abc();
}
class B implements A,x
{
	public void show()
	{
		System.out.println("in show");
	}
	public void abc()
	{
		System.out.println("in abc");
	}
}
public class Demo1 {

	public static void main(String[] args) {
//		A obj=new B();
//		obj.show();
//		//obj.abc();//-->error
		
		B obj=new B();
		obj.show();
		obj.abc();
		
		x obj1= new B();//jate lakhu che.
		obj1.show();//jate lakhu che.
		obj1.abc();//jate lakhu che.
	}

}
*/