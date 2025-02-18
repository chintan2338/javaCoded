
/*
interface DemoAno
{
	void math1();
}
class HarryFunc implements DemoAno
{
	public void math1()
	{
		System.out.println("This is method1");
	}
}
public class BambdaDemo1 {

	public static void main(String[] args) {
		DemoAno obj=new HarryFunc();
		obj.math1();

	}

}
*/

//OR

/*
interface DemoAno
{
	void math1();
}
//class HarryFunc implements DemoAno
//{
//	public void math1()
//	{
//		System.out.println("This is method1");
//	}
//}
public class LambdaDemo1 {

	public static void main(String[] args) {
//		DemoAno obj=new HarryFunc();
//		obj.math1();
		DemoAno obj=()->{System.out.println("This is method1");};
			obj.math1();
	}

}
*/

//OR

interface DemoAno
{
	void math1(int a);
}

public class LambdaDemo1 {

	public static void main(String[] args) {

		DemoAno obj=(a)->{System.out.println("This is method1 "+a);};
			obj.math1(6);
	}

}