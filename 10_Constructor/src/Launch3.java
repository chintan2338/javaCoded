//constructor overloading 
/*
class Student1 
{
	private String name;
	private int age;
	
	public Student1()
	{
		System.out.println("Default Constructor is called");
		name="Rohan";
		age=18;
	}
	
	public Student1(String name)
	{
		this.name=name;
		age=19;
	}
	public Student1(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void disp()
	{
		System.out.println(name);
		System.out.println(age);
	}
	
}
public class Launch3 {

	public static void main(String[] args) {
		Student1 st1=new Student1();
		st1.disp();
		
		Student1 st2=new Student1("Rahul");
		st2.disp();
		
		Student1 st3=new Student1("Rohit",19);
		st3.disp();

	}

}
*/

//OR


//EXTRA BY MY SELF
/*
class Student1 
{
	private float age;
	
	public Student1(int age)
	{
		this.age=age;
	}
	public Student1(float age)
	{
		this.age=age;
	}
	public void disp()
	{
		System.out.println(age);
	}
}
public class Launch3 {

	public static void main(String[] args) {
		
		
		Student1 st1=new Student1(19);
		st1.disp();
		
		Student1 st2=new Student1(56.4f);
		st2.disp();

	}

}
*/