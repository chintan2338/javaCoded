//HashMap And LindkedHashMap
import java.util.*;
public class Map2 {

	public static void main(String[] args) 
	{
		HashMap hm1=new HashMap();
		//hm1.put(null,null);  //null key bhi allow hai.//Aur null value bhi allow hai.
		hm1.put(02,"Rohit");//Entry
		hm1.put(03,"Rohan");//Entry
		hm1.put(04,"Rohan");//Entry
		hm1.put(04,"Rohan");//-->same value allow but key difference honi chahiye.
		
		System.out.println(hm1);
		
		HashMap hm2=new HashMap();
		
		hm2.put("virat","Rohit");
		hm2.put("Rohit", "Rohan");
		hm2.put("Hyder","Rohan");
		
		System.out.println(hm2);
		
		//order of insertion is retained in LinkedHashMaps
		LinkedHashMap lhm=new LinkedHashMap();
		//LindkedHashMap me order of insertion maintaion ho raha hai.
		lhm.put("virat","Rohit");
		lhm.put("Rohit", "Rohan");
		lhm.put("Hyder","Rohan");
		
		System.out.println(lhm);

	}

}
