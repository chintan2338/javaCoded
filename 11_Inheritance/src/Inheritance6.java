//Rule to override method in child class
class Animal
{
	public void eat()
	{
		System.out.println("Animal eats everyday");
	}
	 protected void age(int x)
	 {
	     System.out.println("Animal age is");
	 }
}
class Tiger extends Animal
{
	 public void eat()
	 {
	     System.out.println("Tiger hunt and eat");
	 }
//	 protected int age(int x)
//	 {
//		 return 10;            //-->No Change visibility of access modifier
//	 }
//	 public int age(int x)
//	 {
//		 return 10;            //-->No Change in return type 
//	 }
	 public void age(int x)
	 {
		 System.out.println("aa jate lakhelu che");//-->No Change in parameter for overriding method 
	 }
}
public class Inheritance6 {

	public static void main(String[] args) 
	{
		Tiger t=new Tiger();
		t.eat();

	}

}

//Rule to override method in child class
/*class Animal
{
    public void eat()
    {
        System.out.println("Animal needs sleep");
    }
    public void age(int x)
    {
        System.out.println("Animal age is");
    }
}
class Tiger extends Animal
{
    public void eat()
    {
        System.out.println("Tiger hunt and eat");
    }
    public int age(int x)
    {
        return 10;
    }
}


public class Inheritance6
{
    public static void main(String []args)
    {
        Tiger t = new Tiger();
        t.eat();
    }
}
*/