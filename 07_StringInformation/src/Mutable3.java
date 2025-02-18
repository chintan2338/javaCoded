//More On mutable String
public class Mutable3 {

	public static void main(String[] args) {
		
		StringBuilder sb2=new StringBuilder();
		System.out.println(sb2);
		System.out.println(sb2.capacity());
		
		
//		StringBuilder sb= new StringBuilder();		
//		System.out.println(sb.capacity());//initial capacity 16 hoti hai
//		sb.append("abcdefghijklmnop");
//		System.out.println(sb.capacity());
//		sb.append("s");
//		System.out.println(sb.capacity());//How many character you can add
//		System.out.println(sb.length());//How many character are present
		
//		StringBuffer sb2=new StringBuffer("Sachin");
//		System.out.println(sb2);
//		System.out.println(sb2.capacity());//22=16+6
//		System.out.println(sb2.charAt(1));
//		sb2.setCharAt(1,'A');
//		System.out.println(sb2);//sAchin
		
//		StringBuilder sb2=new StringBuilder("Sachin");
//		System.out.println(sb2);
//		System.out.println(sb2.capacity());//22=16+6

//		StringBuilder sb=new StringBuilder(150);
//		System.out.println(sb.capacity());
//		sb.append("java");
//		System.out.println(sb.capacity());
//		System.out.println(sb);
//		sb.trimToSize();//jitane character add hai utani capacity kar dega.
//		System.out.println(sb.capacity());//4
		
//		StringBuilder sb=new StringBuilder("pwjava");
//		System.out.println(sb);
//		System.out.println(sb.reverse());
	}

}
