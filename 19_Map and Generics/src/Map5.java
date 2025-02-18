//other In-Built Classes In Map Hierarchy
import java.util.*;
public class Map5 {

	public static void main(String[] args) 
	{
		Hashtable ht = new Hashtable();
		ht.put(1,"Rohit");
		ht.put(2,"Rohan");
		ht.put(3,"Ramesh");
		//ht.put(null,"Hyder");//null key is not allow
		//ht.put(4,null);  //null value is not allow.
		ht.putIfAbsent(2,"Roahan");//jo 2 number ni key na hoy to data add thay nahi to na thay.
		System.out.println(ht);
		
		TreeMap tm = new TreeMap();
		
		Integer i = new Integer(5);
		
		tm.put(2,"Rohit");
		tm.put(1,"Ramesh");
		tm.put(4,"Rahul");
		tm.put(3,"Rohsn");
		//tm.put(i,"patel");  //key ki jagah object ka referenct bhi de sakate hai.
		
		System.out.println(tm);
	}

}
