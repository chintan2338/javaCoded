
package Rivision;

public class Car 
{
	class Engine 
	{
		void disp()
		{
			System.out.println("Inner class disp");
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Main mehtod outer class");
		//Car car=new Car();
		//Car.Engine e=car.new Engine(); 
		//e.disp();
		
		//OR
//		Car.Engine e=new Car().new Engine();
//		e.disp();
		
		//OR
		new Car().new Engine().disp();//anonymous object
		//Engine e=new Engine();//-->compile error
		
		
	}

}
