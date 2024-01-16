package LinkedList;
import java.util.*;
public class LaunchLL {

	public static void main(String[] args) 
	{
		LinkedList ll1=new LinkedList();
		
		ll1.add(100);
		ll1.add(200);
		ll1.add(300);
		ll1.add(300);
		//System.out.println(ll1.get(1));  //correct
		System.out.println(ll1);
		
		LinkedList ll2=new LinkedList();
		ll2.add("Pwskill");
		ll2.add('1');
		ll2.add('j');
		System.out.println(ll2);
		
		LinkedList ll3=new LinkedList();
		ll3.add(10);
		ll3.add(20);
		ll3.add(30);
		
		ll3.addFirst("Pw");//extra
		ll3.addLast(100);
		
		System.out.println(ll3);
		
		ll3.add(2,10);
		System.out.println(ll3);
		
		System.out.println(ll3.peek());//collection  ka pahela object return kar raha hai.
		System.out.println(ll3);
		
		System.out.println(ll3.poll());//pahela object nikal ke de raha hai.
		System.out.println(ll3);
		
	}

}
