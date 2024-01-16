//HashMap And LindkedHashMap
import java.util.*;
public class Map2 {

	public static void main(String[] args) 
	{
		HashMap hm1=new HashMap();
		//hm1.put(null,null);  //null value allow hai.
		hm1.put(02,"Rohit");
		hm1.put(03,"Rohan");
		hm1.put(04,"Rohan");
		//hm1.put(04,"Rohan");//-->same value allow but key difference honi chahiye.
		
		System.out.println(hm1);
		
		HashMap hm2=new HashMap();
		
		hm2.put("virat","Rohit");
		hm2.put("Rohit", "Rohan");
		hm2.put("Hyder","Rohan");
		
		System.out.println(hm2);
		
		LinkedHashMap lhm=new LinkedHashMap();
		
		lhm.put("virat","Rohit");
		lhm.put("Rohit", "Rohan");
		lhm.put("Hyder","Rohan");
		
		System.out.println(lhm);

	}

}
