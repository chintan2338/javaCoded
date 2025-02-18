//handling vs ducking the Exception 

//exception handle by b method 
/*
class Demo
{
	public void a()
	{
		b();
	}
	public void b()
	{
		int num1=8;
		int num2=0;
		try 
		{
			int result =num1/num2;
			System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println("error "+e.getMessage());
		}
	}
}
public class ExceptionForth {

	public static void main(String[] args) 
	{
		Demo obj=new Demo();
		obj.a();

	}

}
*/

//b bolega meto bhai handle nahi karane wala exception ko.
// jo method b ko call kar raha hai use hi exception handle karane ke liye bhej rahe hai.
/*
class Demo
{
	public void a()
	{
		try 
		{
			b();
		}
		catch(Exception e)
		{
			System.out.println("error "+e);
		}
	}
	public void b()throws Exception//or throws ArithmeticException 
	{
		int num1=8;
		int num2=0;
		
			int result =num1/num2;
			System.out.println(result);
		
		
	}
}
public class ExceptionForth {

	public static void main(String[] args) 
	{
		Demo obj=new Demo();
		obj.a();

	}

}
*/

//a bolega meto bhai handle nahi karane wala exception ko.
/*
class Demo
{
	public void a() throws Exception 
	{
		b();
	}
	public void b()throws Exception//or throws ArithmeticException 
	{
		int num1=8;
		int num2=0;
		
			int result =num1/num2;
			System.out.println(result);
		
		
	}
}
public class ExceptionForth {

	public static void main(String[] args)  
	{
		Demo obj=new Demo();
		try 
		{
			obj.a();
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}

}*/