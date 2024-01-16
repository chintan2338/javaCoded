//Accessing The Object in Map
import java.util.*;
import java.util.Map.*;
public class Map3 {

	public static void main(String[] args)
	{
		Map map=new HashMap();
		map.put(1,"Rohan");
		map.put(2,"Rohit");
		map.put(3,"Rahul");
		map.put(4,"Rames");

		System.out.println(map);
		
		System.out.println(map.get(4));
		Set keySet=map.keySet();//KeySet method return us keys only
		Iterator itr1=keySet.iterator();
		while(itr1.hasNext())
		{
			//System.out.println(itr1.next());
			Integer key=(Integer)itr1.next();
			System.out.println(key);
			
		}
		
		Collection values=map.values();//return values
		Iterator itr2=values.iterator();
		while(itr2.hasNext())
		{
			//System.out.println(itr2.next());
			String names=(String)itr2.next();
			System.out.println(names);
		}
		
		//Collection entrySet1=map.entrySet();//jate
		Set entrySet=map.entrySet();//return value & keys also
		Iterator itr3=entrySet.iterator();
		while(itr3.hasNext())
		{
			//System.out.println(itr3.next());
			Map.Entry data=(Entry)itr3.next();
			System.out.println(data.getKey()+":"+data.getValue());
		}
		
	}

}
