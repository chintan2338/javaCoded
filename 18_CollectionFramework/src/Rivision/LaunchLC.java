package Rivision;
import java.util.*;
public class LaunchLC {

	public static void main(String[] args) 
	{
		Vector v =new Vector();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		
		System.out.println(v);
		
		Enumeration en=v.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
//		Iterator itr=v.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
	}

}
