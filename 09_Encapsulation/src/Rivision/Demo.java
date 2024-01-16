package Rivision;
class Student
{
	int age;
	String name;
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
	
//	public void setAge(int age)
//	{
//		this.age=age;
//	}
//	public int getAge()
//	{
//		return age;
//	}
	
}
public class Demo {

	public static void main(String[] args) 
	{
		Student obj1=new Student();
		obj1.setAge(20);
		System.out.println(obj1.getAge());
		obj1.setName("chintan");
		System.out.println(obj1.getName());

	}

}
