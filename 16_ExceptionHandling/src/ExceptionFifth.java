//Custom exception and throw keyword
/*
public class ExceptionFifth {

	public static void main(String[] args) 
	{
		int num1=6;
		int num2=-2;
		try
		{
			if(num2<0)
			{
				System.out.println("Enter a valid number");
			}
			else
			{
				int result =num1/num2;
				System.out.println(result);
			}
		}
		catch(Exception e)
		{
			System.out.println("Enter a valid number");
		}
	}

}
*/

// DRY :-Do Not Repeat Yourself
// ઉપરના કોડમાં Enter a valid number બે વાર રીપીટ થાય છે

/*
public class ExceptionFifth {

	public static void main(String[] args) 
	{
		int num1=6;
		int num2=-2;
		try
		{
			if(num2<0)
			{
				//Exception e=new Exception();//or Exception e=new Exception("negative nubmer");
				
				Exception e=new ArithmeticException("negative number");//Exception e=new ArithmeticException();
				throw e;
			}
			else
			{
				int result =num1/num2;
				System.out.println(result);
			}
		}
		catch(Exception e)
		{
			System.out.println("Enter a valid number "+e);
		}
	}

}*/


//custom exception 
/*
class MyException extends Exception
{
	
}
public class ExceptionFifth {

	public static void main(String[] args) 
	{
		int num1=6;
		int num2=-2;
		try
		{
			if(num2<0)
			{
				//Exception e=new Exception();//or Exception e=new Exception("negative nubmer");
				
				Exception e=new MyException();//Exception e=new ArithmeticException("");
				throw e;
			}
			else
			{
				int result =num1/num2;
				System.out.println(result);
			}
		}
		catch(Exception e)
		{
			System.out.println("Enter a valid number"+e);
		}
	}

}
*/

//ham to meassage bhi aaye aesa chahate hai.(message->negaive number)
/*
class MyException extends Exception
{
	public MyException()
	{
		
	}
	public MyException(String msg)
	{
		super(msg);
	}
}
public class ExceptionFifth {

	public static void main(String[] args) 
	{
		int num1=6;
		int num2=-2;
		try
		{
			if(num2<0)
			{
			
				Exception e=new MyException("Negative number");
				throw e;
			}
			else
			{
				int result =num1/num2;
				System.out.println(result);
			}
		}
		catch(Exception e)
		{
			System.out.println("Enter a valid number"+e);
		}
	}

}
*/