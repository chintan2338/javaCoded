//Threads and needs of multiple threads
import java.util.Scanner;
public class LaunchMulti1 {

	public static void main(String[] args) 
	{
		System.out.println("Calculation Task Started");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter first number");
		int num1=sc.nextInt();
		
		System.out.println("Please enter second number");
		int num2=sc.nextInt();
		
		int res=num1+num2;
		System.out.println(res);
		System.out.println("Calculation Task Ended");
		
		System.out.println("*************************************");
		System.out.println("Printing * Task Started");
		
		for(int i=0;i<4;i++)
		{
			System.out.println("*");
		}
		
		System.out.println("Printing * Task Ended");
		System.out.println("*************************************");
		
		System.out.println("Desplaying important message task");
		for(int i=0;i<3;i++)
		{
			System.out.println("Focus is important to master skill");
		}
		
		System.out.println("Displaying import meassage task ended");
		System.out.println("*************************************");
	}

}
