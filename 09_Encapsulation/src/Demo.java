/*
class Student
{
	int age;
	String name;
	
	public void show()
	{
		System.out.println(name+" "+age);
	}
}
public class Demo {

	public static void main(String[] args) {
	
		Student obj=new Student();
		obj.age=10;//અહી તો અંદર ની વાત લોકો બહાર થી access કરે છે . 
		obj.name="Rahul";
		obj.show();

	}

}*/

//OR
/*
class Student
{
	private int age;
	private String name;
	
	public void setData()
	{
		age=18;
		name="Rahul";
	}
	public void show()
	{
		System.out.println(name+" "+age);
	}
}
public class Demo {

	public static void main(String[] args) {
	
		Student obj=new Student();
		obj.setData();
		obj.show();

	}

}
*/

//private & shadowing problem
/*
class Student
{
	private int age;
	private String name;
	
	public void setData1(int age)
	{
		age=age;
		
	}
	public void setData2()
	{
		name="Rahul";
	}
	public void show()
	{
		System.out.println(name+" "+age);
	}
}
public class Demo {

	public static void main(String[] args) {
	
		Student obj=new Student();
		Student obj1=new Student();
		obj.setData1(18);
		obj1.setData1(25);
		obj.show();
		obj1.show();

	}

}
*/

//This keyword
/*
class Student
{
	private int age;
	private String name;
	
	public void setData1(int age)
	{
		this.age=age;	
	}
	public void setData2(String name)
	{
		this.name=name;
	}
	public void show()
	{
		System.out.println(name+" "+age);
	}
}
public class Demo {

	public static void main(String[] args) {
	
		Student obj=new Student();
		Student obj1=new Student();
		obj.setData1(18);
		obj1.setData1(25);
		obj.setData2("Navin");
		obj1.setData2("kiran");
		obj.show();
		obj1.show();
	}

}
*/

//Setters & Getters
/*
class Student
{
	private int age;
	private String name;
	
	public void setAge(int age)
	{
		this.age=age;	
	}
	public int getAge()
	{
		return age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void show()
	{
		System.out.println(name+" "+age);
	}
}
public class Demo {

	public static void main(String[] args) {
	
		Student obj=new Student();
		Student obj1=new Student();
		obj.setAge(18);
		obj1.setAge(25);
		obj.setName("Navin");
		obj1.setName("kiran");
		int stud1Age = obj.getAge();
		System.out.println(stud1Age);
	}

}
*/
//OR
/*
class Student
{
	private int age;
	private String name;
	
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void show()
	{
		System.out.println(name+" "+age);
	}
}
public class Demo {

	public static void main(String[] args) {
	
		Student obj=new Student();
		Student obj1=new Student();
		obj.setAge(18);
		obj1.setAge(25);
		obj.setName("Navin");
		obj1.setName("kiran");
		int stud1Age = obj.getAge();
		System.out.println(stud1Age);
	}

}
*/