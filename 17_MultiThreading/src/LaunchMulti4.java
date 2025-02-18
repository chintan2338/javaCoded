//6.More on creating Multiple Threads.//creating thread by Extending Thread class.
import java.util.Scanner;


class Calc extends Thread
{
	public void run()
	{
		System.out.println("Calculation Task Started");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter first number");
		int num1=sc.nextInt();
		
		System.out.println("Please enter 2nd number");
		int num2=sc.nextInt();
		
		int res=num1+num2;
		
		System.out.println(res);
		System.out.println("Calculation Task Ended");
		
		System.out.println("***************************************");
	}
}

class Message extends Thread{
	public void run()
	{
		
		System.out.println("Displaying important message task");
		try 
		{
			for(int i=0;i<3;i++)
			{
				System.out.println("Focus is important to master skills");
				Thread.sleep(2000);//2000 mili-sec
			}
		}
		catch(Exception e)
		{
			System.out.println("some problem");
		}
		
		System.out.println("Displaying import message task ended");

	}
}
public class LaunchMulti4 {

	public static void main(String[] args) 
	{
		System.out.println("Main Thread Started");
		
		Calc t1=new Calc();//ye Calc ka object equvilent hai Thread ke object ke barabar
		
		Message t2=new Message();//ye Message ka object equvilent hai Thread ke object ke barabar
		
		t1.start();
		t2.start();
	
		
	}

}
