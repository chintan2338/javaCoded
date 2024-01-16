//try with multiple catch blocks

/*
public class ExceptionSecond {

	public static void main(String[] args) 
	{
		int num1=6;
		int num2=0;
		int result=0;

		try
		{
			result=num1/num2;
		}
		catch(ArithmeticException e)//RuntimeException e//Exception e
		{
			System.out.println("cannot divide by zero "+e);
		}
		System.out.println(result);
		System.out.println("Bye");
	}

}
*/

//OR
/*
public class ExceptionSecond {

	public static void main(String[] args) 
	{
		int num1=6;
		int num2=0;
		int result=0;
		int values[]= {4,7,2,9};
		try
		{
			
			result=num1/num2;
			System.out.println(values[5]);
		}
		catch(Exception e)
		{
			System.out.println("cannot divide by zero "+e);
		}
		System.out.println(result);
		System.out.println("Bye");
	}

}*/


//OR
/*
public class ExceptionSecond {

	public static void main(String[] args) 
	{
		int num1=6;
		int num2=2;
		int result=0;
		int values[]= {4,7,2,9};
		String name=null;
		try
		{
			
			result=num1/name.length();
			//System.out.println(values[5]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("cannot divide by zero "+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(values[values.length-1]);
			System.out.println("stay in your limit"+e);
		}
		catch(Exception e)
		{
			System.out.println("something went wrong"+e);
		}
		System.out.println(result);
		System.out.println("Bye");
	}

}*/

