//Ways To Compare 
/*
public class Launch3 {

	public static void main(String[] args) {
		String s1 = "pwskill";
		String s2 = new String("pwskill");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

	}

}
*/
//OR
/*
public class Launch3 {

	public static void main(String[] args) {
		String s1 = "pwjava";
		String s2 = "pwjava";
		String s3 = "pwJava";
		
		System.out.println(s1==s2);//True
		System.out.println(s1==s3);//False
		System.out.println(s1.equals(s2));//True
		System.out.println(s1.equals(s3));//False

	}

}
*/
//OR
/*
public class Launch3 {

	public static void main(String[] args) {
		String s1 = "pwskill";
		String s2 = new String("PWskill");
		String s3 = new String("pwskill");
		
		System.out.println(s1==s2);//false
		System.out.println(s2==s3);//false
		System.out.println(s1.equals(s2));//false
		System.out.println(s2.equals(s3));//false
		System.out.println(s1.equalsIgnoreCase(s2));//true
		System.out.println(s2.equalsIgnoreCase(s3));//true
		
	}

}
*/
