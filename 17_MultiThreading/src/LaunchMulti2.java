//Main thread in java

/*
public class LaunchMulti2 {

	public static void main(String[] args) 
	{
		System.out.println("Main Thread");
		String name = Thread.currentThread().getName();
		System.out.println("The name of current thread is "+name);
		System.out.println("the priority of main thread is "+Thread.currentThread().getPriority());	
		System.out.println("Thread " + Thread.currentThread().getId()+ " is running");
	}

}
*/

//OR

/*
public class LaunchMulti2 {

	public static void main(String[] args) 
	{
		System.out.println("Main Thread");
		System.out.println("Before changing");
		String name = Thread.currentThread().getName();
		System.out.println("The name of main thread is "+name);//main
		System.out.println("the priority of main thrad is "+Thread.currentThread().getPriority());//5
		
		System.out.println("After changing");
		Thread t=Thread.currentThread();
		t.setName("PW");
		t.setPriority(1);
		
		String name1 = Thread.currentThread().getName();
		System.out.println("The name of main thread is "+name1);
		System.out.println("the priority of main thrad is "+Thread.currentThread().getPriority());
	}

}
*/
