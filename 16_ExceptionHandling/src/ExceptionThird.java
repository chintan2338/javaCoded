//Try Finally And Try with Resources
import java.util.Scanner;
import java.util.InputMismatchException;
/*
public class ExceptionThird {

	public static void main(String[] args) 
	{
		int num=0;
		Scanner sc = new Scanner(System.in);
		
		num=sc.nextInt();
		
		System.out.println(num);

	}

}
*/

//critical statement statement ko hamesha try block me rakhana chahiye.
/*
public class ExceptionThird {

	public static void main(String[] args) 
	{
		int num=0;
		Scanner sc = new Scanner(System.in);
		try
		{
		   num=sc.nextInt();
		   sc.close();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter a number");
			sc.close();
		}
		System.out.println(num);

	}

}*/

//do not repeat your code -->sc.close repeat thay se.
/*
public class ExceptionThird {

	public static void main(String[] args) 
	{
		int num=0;
		Scanner sc = new Scanner(System.in);
		try
		{
		   num=sc.nextInt();
		   
		}
//		catch(InputMismatchException e)
//		{
//			System.out.println("Enter a number");
//			
//		}
		
		finally
		{
			sc.close();
			System.out.println("Resource closed");
		}
		System.out.println(num);
	}

}
*/

//OR

//

public class ExceptionThird {

	public static void main(String[] args) 
	{
		int num=0;
		//try with resource  //અહીં exception આવે કે ના આવે resources close થવાનો છે.
		try(Scanner sc = new Scanner(System.in);)
		{
		   num=sc.nextInt();
		   
		}

		System.out.println(num);
	}

}