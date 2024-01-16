package Rivision;

import java.util.Scanner;

class Demo
{
	public void alpha()
	{
		System.out.println("Connection2 is established");
		Scanner scan = new Scanner(System.in);
		try
		{
			System.out.println("Enter the numerator");
			int a=scan.nextInt();
			System.out.println("Enter the denominator");
			int b=scan.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Exception caught inside alpha()");
			throw e;
		}
		System.out.println("Connection2 is terminated");
	}
}
public class Launch {

	public static void main(String[] args) 
	{
		System.out.println("Connection1 is terminated");
		Demo d1 = new Demo();
		d1.alpha();
		System.out.println("Connection1 is terminated");

	}

}
