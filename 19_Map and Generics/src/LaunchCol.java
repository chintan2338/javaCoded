import java.util.*;
//collection is interface (જેમાં list,queue,set જેવા હતા) & Collections is class
public class LaunchCol {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(50);
		
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println(al);
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("PW");
		al2.add("HYDER");
		al2.add("JAVA");
		al2.add("ROHAN");
		
		System.out.println(al2);
		
		Collections.sort(al2);
		System.out.println(al2);
		
		
		ArrayList al3 = new ArrayList();
		al3.add(10);
		al3.add(20);
		al3.add(20);
		al3.add(30);
		al3.add(40);
		al3.add(50);
		
		System.out.println(al3);
		//if data in sorted order than we use binarySearch other wise not use binarySearch
		int index = Collections.binarySearch(al3,30);//if 60 instead of 30 means it is not in the Arraylist so give negative value
		System.out.println("index is "+ index);
		
		Collections.rotate(al3,3);//index 3 se rotate ho jayega.
		System.out.println(al3);
		
		Collections.shuffle(al3);
		System.out.println(al3);
		
		System.out.println(Collections.frequency(al3,20));//al3 me 20 kitani bar  aaya hai vo dega.
	}

}
