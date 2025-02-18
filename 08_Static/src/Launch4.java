//1:52 
class Demo1
{
	static int a;
	static int b;
	
	int m;//instance variable,object variable,feels,properties
	int n;	
	
	static//static initialization block,static block
	{
		a=10;
		b=20;
		System.out.println("control in static block");
	}
	
	{//initialization block 
		m=100;
		n=200;
		System.out.println("control in non static block");
	}
	
	static void disp1()//static method
	{
		System.out.println("value of static var"+a);
		System.out.println("value of static var"+b);
	}
	void disp2()//static method
	{
		System.out.println("value of instance var"+m);
		System.out.println("value of instance var"+n);
	}
	
}

public class Launch4 {
	
	public static void main(String[] args) {
		
		Demo1 d=new Demo1();
		Demo1.disp1();
		d.disp2();
	}

}
//Object creation વખતે initialization block execute થાય છે.
//static variable & static block vo sabase pahele execute ho jate hai aur usaki memory bhi de di jati  hai.