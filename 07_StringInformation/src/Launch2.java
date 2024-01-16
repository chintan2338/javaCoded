//Immutable String And Memory Map
public class Launch2 {

	public static void main(String[] args) {
		String s1 = new String("pw");
		String s2 = new String("pw");
		System.out.println(s1==s2);//false
		
		String s3 = "pw";
		String s4 = "pw";
		System.out.println(s3==s4);//True
		

	}

}
