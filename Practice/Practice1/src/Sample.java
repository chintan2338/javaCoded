// Q: Write a Java program to calculate the sum and product of two given number.
/*
public class Sample {

	public static void main(String[] args) 
	{
		int a,b,sum=0,product=0;
		a=10;
		b=20;
		sum=a+b;
		product=a*b;
		System.out.println("Sum="+sum);
		System.out.println("Product="+product);

	}

}
*/
//Q: Write a Java program to accept two numbers from the user and calculate sum and product.
import java.util.*;
public class Sample
{
	public static void main(String[]args)
	{
		int a,b,sum=0,product=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First No:");
		a=scan.nextInt();
		System.out.println("Enter the Second No:");
		b=scan.nextInt();
		sum=a+b;
		product=a*b;
		System.out.println("Sum="+sum);
		System.out.println("Product="+product);
		
	}
}