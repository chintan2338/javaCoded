//other In-Built Classes In Map Hierarchy
import java.util.*;
public class Map5 {

	public static void main(String[] args) 
	{
		Hashtable ht = new Hashtable();
		ht.put(1,"Rohit");
		ht.put(2,"Rohan");
		ht.put(3,"Ramesh");
		//ht.put(4,null);  //null value is not allow.
		ht.putIfAbsent(2,"Roahan");
		System.out.println(ht);
		
		TreeMap tm = new TreeMap();
		
		Integer i = new Integer(5);
		
		tm.put(i,"Rohit");
		tm.put(1,"Ramesh");
		tm.put(4,"Rahul");
		tm.put(3,"Rohsn");
		
		System.out.println(tm);
	}

}
