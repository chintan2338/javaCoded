//More on Generics in Java
import java.util.*;
/*
public class Gen3 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		List<String> list2 = new ArrayList<String>();
		
		Collection<Integer> list3 = new ArrayList<Integer>();
		
		//List<Object> list4 = new ArrayList<String>();//CE
		
		List<Integer>list5 = new ArrayList<Integer>();
		
		//List<int> list6 = new ArrayList<int>();//CE
	}

}
*/
//OR
/*
class Gen{
	
}
public class Gen3 {

	public static void main(String[] args) {
		Gen g = new Gen();
		
		ArrayList<Gen> al = new ArrayList<Gen>();
		
	}

}
*/

//OR

class Gen<T>{ //arraylist,linklist vagere ma aavi rite <T> lakhelo hase tethi aapane string,Integer jevu pass(add) kari sakiye siye.
	
	T obj;
	
	public Gen(T obj) 
	{
		this.obj = obj;
	}
	
	void disp()
	{
		System.out.println("The type of data is : " + obj.getClass().getName());
	}
	
	public T getobj() 
	{
		return obj;
	}
}

public class Gen3 {

	public static void main(String[] args) 
	{
		Gen<Integer> g = new Gen<Integer>(10);
		g.disp();
		System.out.println(g.getobj());
		
		System.out.println("************************");
		
		Gen<String> g1 = new Gen<String>("pw");
		g1.disp();
		System.out.println(g1.getobj());
	}

}
