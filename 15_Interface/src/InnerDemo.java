//inner - member,static and Anonymous
/*
class A
{
	public void show()
	{
		System.out.println("in show");
	}
	class B//member inner class અને જો આગળ static લગાવીએ તો તે static inner ક્લાસ બની જાય.
	{
		public void display()
		{
			System.out.println("in display");
		}
	}
}

public class InnerDemo {

	public static void main(String[] args) 
	{
		A obj=new A();
		A.B obj1=obj.new B();
		
		obj.show();
		obj1.display();
	}
}
*/
//OR
/*
class A
{
	public void show()
	{
		System.out.println("in show");
	}
	static class B//member inner class અને જો આગળ static લગાવીએ તો તે static inner ક્લાસ બની જાય.
	{
		public void display()
		{
			System.out.println("in display");
		}
	}
}

public class InnerDemo {

	public static void main(String[] args) 
	{
		A obj=new A();
		A.B obj1=new A.B();
		
		obj.show();
		obj1.display();
	}
}
*/