//Introduction To Mutable String 
public class Mutable1 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Virat");
		System.out.println(sb);
		//StringBuffer sb ="Virat";invalid
		sb.append("Kohali");
		System.out.println(sb);

	}

}
