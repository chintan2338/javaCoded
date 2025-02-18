//this() vs super() method

class Student1
{
	private String name;
	private int age;
	
	public Student1()
	{
		//super();
		this("Rohit",19);
		System.out.println("Default Constructor is called");
		name="Rohan";
		age=18;
	}
	
	public Student1(String name)
	{
		this();
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
public class Launch4 {

	public static void main(String[] args) {
		Student1 st1=new Student1();
		st1.disp();
		
		System.out.println("--------");
		Student1 st2=new Student1("Rahul");
		st2.disp();
	
	}

}


//EXTRA BY MY SELF

/*
class Student1
{
	private String name;
	private float age;
	
	
	public Student1(String name,int age)
	{
		this("rahul",34.0f);
		this.name=name;
		//this.age=age; //jo aane uncomment kariae to age 23 print thase.
	}
	public Student1(String name,float age) {
		this.name = name;
		this.age = age;
	}
	public void disp()
	{
		System.out.println(name);
		System.out.println(age);
	}
	
}
public class Launch4 {

	public static void main(String[] args) {
		Student1 st1=new Student1("chintan",23);
		st1.disp();
		
		//System.out.println(super.name);
		//System.out.println(age);
//		Student1 st2=new Student1("Rahul");
//		st2.disp();
	
	}

}
*/