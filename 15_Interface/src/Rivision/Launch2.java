package Rivision;
class Demo
{
	public void disp()
	{
		System.out.println("Singel method of a class");
	}
}
public class Launch2 {

	public static void main(String[] args) 
	{
//		Demo demo=new Demo();
//		demo.disp();
		
		new Demo().disp();//anonymous object

	}

}
