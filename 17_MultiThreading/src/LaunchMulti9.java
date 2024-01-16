//Interrupt() Method 
class Example implements Runnable{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			try {
				System.out.println("Focus is important");
				Thread.sleep(2000);
			}
			catch(InterruptedException e)//Exception e
			{
				System.out.println("Thread is interrupted");
			}
		}
		
	}
}
public class LaunchMulti9 {

	public static void main(String[] args)
	{
		Example ex=new Example();
		
		Thread t1=new Thread(ex);
		
		t1.start();
		t1.interrupt();

	}

}
