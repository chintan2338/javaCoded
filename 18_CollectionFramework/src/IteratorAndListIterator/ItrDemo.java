package IteratorAndListIterator;
import java.util.*;
public class ItrDemo {

	public static void main(String[] args) 
	{
		ArrayList l=new ArrayList();
		
		l.add(10);
		l.add("deepak");
		l.add("rahul");
		
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
