package IteratorAndListIterator;
import java.util.*;
public class ListItrDemo {

	public static void main(String[] args) 
	{
		ArrayList l=new ArrayList();
		
		l.add(10);
		l.add("deepak");
		l.add("rahul");
		
		ListIterator li=l.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		System.out.println("-------------------------");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
		l.remove("deepak");
		System.out.println(l);
		
		l.set(2,"patel");
		System.out.println(l);
	}

}
