//dependency injection on 25feb rivision 
//constructor injection
/*
class student
{
	private heart h;
	public student(heart h)
	{
		this.h=h;
	}
	public void call()
	{
		h.heartBeatr();
	}
}
class heart
{
	public void heartBeatr()
	{
		System.out.println("Heart is important");
	}
}
public class HasA {

	public static void main(String[] args) 
	{
		heart h=new heart();
		student s=new student(h);
		s.call();
	}

}
*/

//OR setter injection
/*
class Student
{
	private Heart h;
//	public Student(Heart h)
//	{
//		this.h=h;
//	}
	public void setH(Heart h)
	{
		this.h=h;
	}
	public void call()
	{
		h.heartBeatr();
	}
}
class Heart
{
	public void heartBeatr()
	{
		System.out.println("Heart is important");
	}
}
public class HasA {

	public static void main(String[] args) 
	{
		Heart h=new Heart();
		Student s=new Student();
		s.setH(h);
		s.call();
	}

}
*/

//OR 
/*
class Car
{
    private Engine eng;
    public Car(Engine eng)
    {
        this.eng=eng;
    }
    public void start()
    {
        eng.engineStart();
    }

}
class Engine
{
    public void engineStart()
    {
        System.out.println("car started");
    }
}

public class HasA {
    public static void main(String[] args) 
    {
        Engine e = new Engine();
        Car c=new Car(e);
        c.start();
    }
}
*/

//OR
/*
class Employ
{
	private AccountNo n;
	public Employ(AccountNo n)
	{
		this.n=n;
	}
	public void showAccount()
	{
		n.show();
	}
	
}
class AccountNo
{
	public void show()
	{
		System.out.println("I show you my account number");
	}
}
public class HasA {
    public static void main(String[] args) 
    {
    	AccountNo eng=new AccountNo();
        Employ emp = new Employ(eng);
        emp.showAccount();
        
    }
}
*/