package Rivision;
interface Calc
{
	void disp();
}
public class Laaunch1 {

	public static void main(String[] args) {
//		Calc c=new Calc()
//		{
//			public void disp()
//			{
//				System.out.println("Hello");
//			}
//			
//		};
		
		Calc c=()->System.out.println("Hello");
		c.disp();
	}

}
