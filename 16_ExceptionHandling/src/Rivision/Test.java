package Rivision;

//public class Test {
//
//	public static void main(String[] args) 
//	{
//		System.out.println("1");
//		try
//		{
//			System.out.println("2");
//			System.out.println("3");
//			System.out.println("4");
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println(5/0);
//		}
//		finally
//		{
//			System.out.println("6");
//		}
//		System.out.println("7");
//	}
//
//}


public class Test {

	public static void main(String[] args) 
	{
		System.out.println("1");
		
		try
		{
			System.out.println("2");
			System.out.println(3/0);
			System.out.println("4");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(5/0);
		}
		finally
		{
			System.out.println("6");
		}
		System.out.println("7");
	}

}
