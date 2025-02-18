//HashMap vs WeakHashMap
import java.util.*;
/*
class Employ
{
	private String name;
	private int empId;
	public Employ(String name,int empId)
	{
		this.name=name;
		this.empId=empId;
	}
	public String toString()
	{
		return empId + "";
	}
	
	@Override
	public void finalize()
	{
		System.out.println("clean up work by GC before de allocating memoery from heap");
	}
	
}
public class Map6 {

	public static void main(String[] args)
	{
		Employ e = new Employ("Hyder",171);
		
		e=null;//eligible for garbage collector
		System.gc();//invocking garbage collector
		
		System.out.println("Last line");
	}

}*/

//OR
/*
class Employ
{
	private String name;
	private int empId;
	public Employ(String name,int empId)
	{
		this.name=name;
		this.empId=empId;
	}
	public String toString()
	{
		return empId + "";
	}
	
	@Override
	public void finalize()
	{
		System.out.println("clean up work by GC before de allocating memoery from heap");
	}
	
}
public class Map6 {

	public static void main(String[] args)
	{
		Employ e = new Employ("Hyder",171);
		
		HashMap hm=new HashMap();
		hm.put(e,"Hyder");
		System.out.println(hm);
		
		e=null;//eligible for garbage collector
		System.gc();//invocking garbage collector //HashMap dominate karata hai Garbase collector ko isiliye gc invoke nahi ho raha.
		
		System.out.println(hm);
		
		System.out.println("Last line");
	}

}*/

//OR
/*
class Employ
{
	private String name;
	private int empId;
	public Employ(String name,int empId)
	{
		this.name=name;
		this.empId=empId;
	}
	public String toString()
	{
		return empId + "";
	}
	
	@Override
	public void finalize()
	{
		System.out.println("clean up work by GC before de allocating memoery from heap");
	}
	
}
public class Map6 {

	public static void main(String[] args)
	{
		Employ e = new Employ("Hyder",171);
		
		WeakHashMap hm=new WeakHashMap();
		hm.put(e,"Hyder");
		System.out.println(hm);
		
		e=null;//eligible for garbage collector
		System.gc();//invocking garbage collector //WeakHashMap not dominate to Garbase-collector so gc is invoked
		
		System.out.println(hm);
		
		System.out.println("Last line");
	}

}
*/