package Rivision;

/*
public class Test1 {

	public static void main(String[] args) 
	{
		try
		{
			int no1=10;
			int no2=5;
			
			System.out.println(no1/no2);
			
			int k[]=new int[5];
			for(int i=0;i<=5;i++)
			{
				k[i]=i;
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}

	}

}*/

//or
//doubt :-what if more than one exception in try block how to handle that 
public class Test1 {

	public static void main(String[] args) 
	{
		try
		{
			int no1=10;
			int no2=0;
			
			System.out.println(no1/no2);
			
//			int k[]=new int[5];
//			for(int i=0;i<=5;i++)
//			{
//				k[i]=i;
//			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("first error "+e);
		}
		catch(ArrayIndexOutOfBoundsException e )
		{
			System.out.println("second error" +e);
		}

	}

}
