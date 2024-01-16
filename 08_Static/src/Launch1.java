
public class Launch1 {
	
	static int age;
	
	static {
		age=18;
		System.out.println("Static block first");
		System.out.println(age);
	}
	public static void main(String[] args) {
		
		System.out.println("Main method badhme");
	}

}
