/*import java.util.Scanner;
class Farmer{
	
	int pa;
	float td;
	float ri;
	float si;
	
	void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please mention the amount required");
		pa=scan.nextInt();
		System.out.println("Please mention time duration ");
		td=scan.nextFloat();
		
		ri=8.5f;
	}
	void compute()
	{
		si=(pa*ri*td)/100f;
	}
	void disp()
	{
		System.out.println("SI is :"+si);
	}
}
public class LaunchFarmer {

	public static void main(String[] args) 
	{
		Farmer f1=new Farmer();
		f1.input();
		f1.compute();
		f1.disp();
		Farmer f2=new Farmer();
		f2.input();
		f2.compute();
		f2.disp();
	}
}
*/

import java.util.Scanner;
class Farmer{
	
	int pa;
	float td;
	static float ri;
	float si;
	
	static 
	{
		ri=8.5f;
	}
	void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please mention the amount required");
		pa=scan.nextInt();
		System.out.println("Please mention time duration ");
		td=scan.nextFloat();
		
	}
	void compute()
	{
		si=(pa*ri*td)/100f;
	}
	void disp()
	{
		System.out.println("SI is :"+si);
	}
}
public class LaunchFarmer {

	public static void main(String[] args) 
	{
		Farmer f1=new Farmer();
		f1.input();
		f1.compute();
		f1.disp();
		Farmer f2=new Farmer();
		f2.input();
		f2.compute();
		f2.disp();
	}
}