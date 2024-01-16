class Studnet5
{
	private String name;
	private int age;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public int getAge()
	{
		return age;
	}
}
public class LaunchEncap {

	public static void main(String[] args) {
		
		Studnet5 st=new Studnet5();
		st.setAge(18);
		st.setName("Rahul");
		System.out.println(st.getAge());
		System.out.println(st.getName());
		
		Studnet5 st1=new Studnet5();
		st.setAge(19);
		st.setName("Rohit");
		System.out.println(st.getAge());
		System.out.println(st.getName());


	}

}
