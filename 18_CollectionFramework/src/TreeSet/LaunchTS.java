package TreeSet;
import java.util.*;
public class LaunchTS 
{
	public static void main(String []args)
	{
		TreeSet ts=new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		
		System.out.println(ts);
		//ts.add(100);//-->No Dublicate allow.
		//System.out.println(ts);
		
		System.out.println(ts.higher(50));//75
		System.out.println(ts.lower(50));//25
		
		System.out.println(ts.ceiling(40));//50
		System.out.println(ts.floor(40));//25
		
		System.out.println(ts.ceiling(50));//50
		System.out.println(ts.floor(50));//50
		
//		System.out.println(ts.higher(40));//50
//		System.out.println(ts.lower(40));//25
		
		
		TreeSet ts1=new TreeSet();
		ts1.add(10);
		ts1.add(20);
		ts1.add(30);
		ts1.add(40);
		ts1.add(50);
		ts1.add(60);
		ts1.add(70);
		
		System.out.println(ts1);
	}
}
