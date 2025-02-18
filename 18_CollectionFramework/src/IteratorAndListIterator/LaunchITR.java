package IteratorAndListIterator;
import java.util.*;
public class LaunchITR {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(100);
		System.out.println(al);
		
		//for loop
//		
//		for(int i=0;i<al.size();i++)
//		{
//			//Object o=al.get(i);
//			//System.out.println(o);
//			System.out.println(al.get(i));
//		}
		
		//for each
		
//		for(Object o:al)
//		{
//			System.out.println(o);
//		}

		//Iterator or cursor
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			//Integer i=(Integer)itr.next();
			//System.out.println(i);
					//or
			System.out.println(itr.next());
		}
		
		ListIterator litr=al.listIterator(al.size());
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
			
		}
		
		
		
		
		ListIterator litr1=al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
			
		}
		
	}

}
//Index based Access jahape Allow nahi (ArrayDequeue,PriorityQueue,TreeSet) hai wahape ham for loop use karake information 
//fatch nahi kar sakate isiliye hame Iterator and ListIterator ka concepte aata hai ?