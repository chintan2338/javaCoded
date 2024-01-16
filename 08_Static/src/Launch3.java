class Demo
{
	static void disp1()
	{
		System.out.println("Static disp1");
	}
	void disp2()
	{
		System.out.println("Non static disp 2");
	}
}
public class Launch3 {

	public static void main(String[] args) 
	{
		Demo.disp1();
		//Demo.disp2(); //disp2 is non static so we don't call directly
		
		Demo d=new Demo();
		d.disp1();
		d.disp2();
		

	}

}
