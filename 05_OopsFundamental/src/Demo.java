//Method overloading 

//class Calc
//{
//	public int add1(int n1,int n2)
//	{
//		int result = n1+n2;
//		return result;
//	}
//	public int add2(int n1,int n2,int n3)
//	{
//		int result = n1+n2+n3;
//		return result;
//	}
//	
//}
//public class Demo {
//
//	public static void main(String[] args) {
//	
//		Calc obj = new Calc();
//		int result=obj.add1(4,3);
//		int res1=obj.add2(4,3,2);
//		System.out.println(result);
//		System.out.println(res1);
//
//	}
//
//}

//OR

//class Calc
//{
//	public int add(int n1,int n2)
//	{
//		int result = n1+n2;
//		return result;
//	}
//	public int add(int n1,int n2,int n3)
//	{
//		int result = n1+n2+n3;
//		return result;
//	}
//	public double add(double n1,double n2)
//	{
//		double result = n1+n2;
//		return result;
//	}
//	
//}
//public class Demo {
//
//	public static void main(String[] args) {
//	
//		Calc obj = new Calc();
//		int result=obj.add(4,3);
//		int res1=obj.add(4,3,2);
//		double res2=obj.add(4.5,2.1);
//		System.out.println(result);
//		System.out.println(res1);
//		System.out.println(res2);
//
//	}
//
//}

//Auto Matic Promotion In java (OR)

class Calc
{
	
	public void show(byte n)
	{
		System.out.println("byte "+n);
	}
	public void show(short n)
	{
		System.out.println("short "+n);
	}
//	public void show(char n)
//	{
//		System.out.println("char "+n);
//	}
	public void show(int n)
	{
		System.out.println("int "+n);
	}
	public void show(double n)
	{
		System.out.println("double "+n);
	}
	
}
public class Demo {

	public static void main(String[] args) {
		
		Calc obj = new Calc();
//		byte b=2;
//		obj.show(b);
		obj.show('P');
		
		

	}

}